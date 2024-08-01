package edu.icet.hrms.loginserver.service.impl;

import edu.icet.hrms.loginserver.dto.User;
import edu.icet.hrms.loginserver.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return false;
    }
}
