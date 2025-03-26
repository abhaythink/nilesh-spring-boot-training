package com.spring.crud_api.Service.Impl;

import com.spring.crud_api.Dto.UserDto;
import com.spring.crud_api.Entity.UserEntity;
import com.spring.crud_api.Repository.UserRepository;
import com.spring.crud_api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public void createUser(UserDto userDto) {

        UserEntity userEntity = UserEntity.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .build();
        userRepository.save(userEntity);

    }


    public List<UserEntity> getAllUser() {
        List<UserEntity> userEntities = (List<UserEntity>) userRepository.findAll();
        return userEntities;
    }

    @Override
    public void updateUser(UUID uuid, UserDto userDto) {
        UserEntity userEntity = userRepository.findByUuid(uuid);

        if (Objects.nonNull(userEntity)) {
            userEntity.setName(userDto.getName());
            userEntity.setEmail(userDto.getEmail());

            userRepository.save(userEntity);

    }

    }

    @Override
    public void deleteUser(UUID uuid) {
        userRepository.deleteByUuid(uuid);
    }
}
