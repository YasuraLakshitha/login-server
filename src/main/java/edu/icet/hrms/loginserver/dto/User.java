package edu.icet.hrms.loginserver.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class User {
    private UUID userId;
    private String userName;
    private String password;
    private String email;
}
