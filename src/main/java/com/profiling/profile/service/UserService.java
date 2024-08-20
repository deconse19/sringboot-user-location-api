package com.profiling.profile.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.profiling.profile.dto.UserLocationDto;
import com.profiling.profile.mapper.UserLocationMapper;
import com.profiling.profile.repo.UserRepository;

import lombok.NoArgsConstructor;


@Service
@NoArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private UserLocationMapper userLocationMapper;


    public List<UserLocationDto> getAllUserLocation(){
        return userRepository.findAll().stream().map(userLocationMapper::toUserLocationDto).collect(Collectors.toList());
    }

    
}
