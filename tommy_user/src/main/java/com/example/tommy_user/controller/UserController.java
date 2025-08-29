package com.example.tommy_user.controller;

import com.example.tommy_user.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/{id}")
    public UserDto get(@PathVariable Long id) {
        return new UserDto(id, "User-" + id); // 假資料，不連 DB
    }
}
