package com.plm.test.testtask.v1.service;

import com.plm.test.testtask.v1.structs.CreateUserDto;

public interface UserService {

    String addNewUser(CreateUserDto createUserDto);

    String offline(Long userId);

    String online(Long userId);
}
