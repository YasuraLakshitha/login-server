package edu.icet.hrms.loginserver.controller;

import edu.icet.hrms.loginserver.dto.User;
import edu.icet.hrms.loginserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
 private final UserService userService;

    @PostMapping("/auth/login")
    boolean authenticate(@RequestBody User user) {
        return userService.login(user);
    }
}
