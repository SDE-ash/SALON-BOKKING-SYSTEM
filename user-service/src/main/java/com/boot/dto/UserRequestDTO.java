package com.boot.dto;

import com.boot.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserRequestDTO {

    private  String fullname;
    private String email;
    private String phoneNo;


}
