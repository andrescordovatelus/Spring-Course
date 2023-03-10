package com.dsu.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    
    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("Andres");
        boolean isValidPass = password.equalsIgnoreCase("12345");
        return isValidUsername && isValidPass;
    }
}
