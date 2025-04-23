package com.spring.crud_api.Controller;

import com.spring.crud_api.Dto.UserDto;
import com.spring.crud_api.Entity.UserEntity;
import com.spring.crud_api.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

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
    public void updateUser(@PathVariable("uuid") UUID uuid, @RequestBody UserDto userDto){
        userService.updateUser(uuid, userDto);
    }


    // Delete API
    @DeleteMapping("/{uuid}")
    public void deleteUser(@PathVariable("uuid") UUID uuid){
        userService.deleteUser(uuid);
    }


}
