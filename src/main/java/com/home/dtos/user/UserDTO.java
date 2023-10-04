package com.home.dtos.user;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String gender;
    private String name;
    private List<ProfilesDTO> authorities;

}
