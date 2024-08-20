package com.profiling.profile.mapper;

import org.springframework.stereotype.Component;

import com.profiling.profile.dto.UserLocationDto;
import com.profiling.profile.entity.User;

@Component
public class UserLocationMapper {

        public UserLocationDto toUserLocationDto(User user) {
                UserLocationDto userLocationDto = new UserLocationDto();
                userLocationDto.setUserId(user.getId());
                userLocationDto.setEmail(user.getEmail());
                userLocationDto.setPlace(user.getLocation().getPlace());
                userLocationDto.setLongitude(user.getLocation().getLongitude());
                userLocationDto.setLatitude(user.getLocation().getLatitude());

                return userLocationDto;
        }
}
