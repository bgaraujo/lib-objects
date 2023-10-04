package com.home.dtos.user;

import lombok.Data;

import java.util.List;

@Data
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private List<ProfilesDTO> authorities;
}
