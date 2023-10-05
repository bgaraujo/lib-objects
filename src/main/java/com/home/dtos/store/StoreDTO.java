package com.home.dtos.store;

import com.home.dtos.address.AddressDTO;
import com.home.dtos.document.DocumentDTO;
import lombok.Data;

import java.util.List;

@Data
public class StoreDTO {
    private Long id;
    private String name;
    private List<OpeningHoursDTO> openingHours;
    private List<DocumentDTO> documents;
    private AddressDTO address;
    private Long deliverTimeInMinutes;
}
