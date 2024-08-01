package edu.icet.hrms.loginserver.service;

import edu.icet.hrms.loginserver.dto.User;

public interface UserService {
    boolean login(User user);
}
