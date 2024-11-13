package com.home.dtos.townhouses;

import com.home.dtos.address.AddressDTO;
import com.home.dtos.document.DocumentDTO;
import lombok.Data;

import java.util.List;

@Data
public class TownhousesDTO {
    private Long id;
    private String name;
    private String aliasName;
    private List<DocumentDTO> documents;
    private List<AddressDTO> addresses;
    private List<CommonAreaDTO> commonAreas;
}
