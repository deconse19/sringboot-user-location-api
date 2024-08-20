package com.profiling.profile.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.profiling.profile.dto.UserLocationDto;
import com.profiling.profile.service.UserService;

public class UserController {
    private UserService userService;
    
    @GetMapping("/getAllUser")
    public List<UserLocationDto> getAllUserDto(){
        userService.getAllUserLocation();
    }
}
