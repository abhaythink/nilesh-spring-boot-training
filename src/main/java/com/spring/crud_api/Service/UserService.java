package com.spring.crud_api.Service;

import com.spring.crud_api.Dto.UserDto;
import com.spring.crud_api.Entity.UserEntity;

import java.util.List;
import java.util.UUID;

public interface UserService {
    
    void createUser(UserDto userDto);

    List<UserEntity> getAllUser();

    void updateUser(UUID uuid, UserDto userDto);

    void deleteUser(UUID uuid);
}
