package com.spring.crud_api.Controller;

import com.spring.crud_api.Dto.UserDto;
import com.spring.crud_api.Entity.UserEntity;
import com.spring.crud_api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    // Create API
    @PostMapping()
    public void createUser(@RequestBody UserDto userDto) {

        userService.createUser(userDto);
    }


    // Get API
    @GetMapping("/all")
    public List<UserEntity> getAllUser() {

        return userService.getAllUser();
    }


    // Update API
    @PutMapping("/{uuid}")
    public void updateUser(@PathVariable UUID uuid, @RequestBody UserDto userDto){
        userService.updateUser(uuid, userDto);
    }



    // Delete API
    @DeleteMapping("/{uuid}")
    public void deleteUser(@PathVariable UUID uuid){

        userService.deleteUser(uuid);
    }


}
