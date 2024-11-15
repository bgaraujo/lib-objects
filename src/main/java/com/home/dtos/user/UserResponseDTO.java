package com.home.dtos.user;

import com.home.dtos.address.AddressDTO;
import com.home.dtos.document.DocumentDTO;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
public class UserResponseDTO{
    private UUID id;
    private String username;
    private String fullName;
    private Long townHousesId;
    private List<String> phones;
    private List<AddressDTO> address;
    private String residentialUnit;
    private Boolean active;
    private LocalDateTime creationDate;
    private LocalDateTime lastLogin;
    private String observations;
    private List<DocumentDTO> documents;
    private Set<RoleDTO> roles;
}
