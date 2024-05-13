package com.plm.test.testtask.v1.controller;

import com.plm.test.testtask.v1.service.UserService;
import com.plm.test.testtask.v1.structs.CreateUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String addNewRequest(@RequestBody CreateUserDto createUserDto) {
        return userService.addNewUser(createUserDto);
    }

    @GetMapping(value = "/{userId}/online",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String online(@PathVariable Long userId) {
        return userService.online(userId);
    }

    @GetMapping(value = "/{userId}/offLine",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String offline(@PathVariable Long userId) {
        return userService.offline(userId);
    }
}
