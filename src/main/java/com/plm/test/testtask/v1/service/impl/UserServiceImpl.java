package com.plm.test.testtask.v1.service.impl;

import com.plm.test.testtask.v1.model.User;
import com.plm.test.testtask.v1.model.enums.UserStatus;
import com.plm.test.testtask.v1.repository.UserRepository;
import com.plm.test.testtask.v1.service.UserService;
import com.plm.test.testtask.v1.structs.CreateUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String addNewUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setUserStatus(UserStatus.OFFLINE);
        user.setLogin(createUserDto.getLogin());
        user.setFullName(createUserDto.getFullName());
        userRepository.save(user);
        return "Пользователь успешно сохранен в систему " + user;
    }

    @Override
    public String offline(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUserStatus(UserStatus.OFFLINE);
            userRepository.save(user);
            return "Статус пользователя обновлен на оффлайн. UserId = " + user.getId();
        }
        return "Пользователь не найден";
    }

    @Override
    public String online(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUserStatus(UserStatus.ONLINE);
            userRepository.save(user);
            return "Статус пользователя обновлен на онлайн. UserId = " + user.getId();
        }
        return "Пользователь не найден";
    }
}
