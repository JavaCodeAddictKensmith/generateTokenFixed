package com.example.jwtbyChatbot;

import lombok.Data;

@Data
class LoginRequest {
    private String username;
    private String password;
}
