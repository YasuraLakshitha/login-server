package edu.icet.hrms.loginserver.entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserEntity {
    private UUID userId;
    private String userName;
    private String password;
    private String email;
    private UUID roleId;
}
