package com.home.dtos.user;

import lombok.Data;

import java.util.List;

@Data
public class UserResponseDTO {
    private Long id;
    private String username;
    private List<ProfilesDTO> authorities;
}
