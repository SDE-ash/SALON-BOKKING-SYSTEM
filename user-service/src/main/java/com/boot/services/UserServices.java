package com.boot.services;

import com.boot.entity.User;
import com.boot.exceptions.ResourceNotFoundException;
import com.boot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepo userRepo;

    public User getUserById(Long id) {

        return userRepo.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
    }

    public void saveUser(User user) {
        try{
            userRepo.save(User.builder()
                    .fullName(user.getFullName())
                    .email(user.getEmail())
                    .phoneNo(user.getPhoneNo())
                    .createdAt(LocalDateTime.now().withNano(0))
                    .updatedAt(LocalDateTime.now().withNano(0))
                    .build());
        }catch (Exception e){
            throw new RuntimeException("Failed to save user: " + e.getMessage());
        }
    }

    public User getUserByEmail(String email){
//        return userRepo.findAll()
//                .stream()
//                .filter(user -> user.getEmail().equalsIgnoreCase(email)).findFirst()
//                .orElseThrow(()-> new RuntimeException("User not found with email: " + email));

        return userRepo.findByEmailIgnoreCase(email)
                .orElseThrow(()-> new ResourceNotFoundException("user was not found with email: " + email));
    }

    public User getUserByPhoneNo(String phoneNo){
//        return userRepo.findByPhoneNo(phoneNo)
//                .orElseThrow(()-> new RuntimeException("user was not found with phone number: " + phoneNo));
        return userRepo.findAll().stream()
                .filter(user -> user.getPhoneNo().equalsIgnoreCase(phoneNo))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("user was not found with phone number: " + phoneNo));
    }


    public String updateUser(String email, User updtUser){
        Optional<User> existingUserOpt = userRepo.findByEmailIgnoreCase(email);
        if(existingUserOpt.isPresent()){
            User existingUser = existingUserOpt.get();
            existingUser.setFullName(updtUser.getFullName());
            existingUser.setPhoneNo(updtUser.getPhoneNo());
            existingUser.setEmail(updtUser.getEmail());
            existingUser.setUpdatedAt(LocalDateTime.now().withNano(0));
            userRepo.save(existingUser);
            return  "User updated successfully";
        }else{
            throw new ResourceNotFoundException("user not found with email: " + email);
        }

    }


    public String deleteUser(String email) {
        Optional<User> existingUserOpt = userRepo.findByEmailIgnoreCase(email);
        if(existingUserOpt.isPresent()){
            userRepo.delete(existingUserOpt.get());
            return "User deleted successfully";
        }else{
            throw new ResourceNotFoundException("user not found with email: " + email);
        }
    }
}
