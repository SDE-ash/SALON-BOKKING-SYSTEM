package com.boot.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class User {

    private String fullName;

    private String email;

    private String phoneNo;

    private  String role;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
