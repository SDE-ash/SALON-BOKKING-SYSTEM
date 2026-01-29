package com.boot.mapper;

import com.boot.dto.UserRequestDTO;
import com.boot.dto.UserResponseDTO;
import com.boot.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User mapToEntity(UserRequestDTO dto) {
        return User.builder()
                .fullName(dto.getFullname())
                .phoneNo(dto.getPhoneNo())
                .email(dto.getEmail())
                .build();
    }

    public UserResponseDTO mapToDTO(User user) {
        return UserResponseDTO.builder()
                .fullName(user.getFullName())
                .email(user.getEmail())
                .phoneNo(user.getPhoneNo())
                .build();
    }
}
