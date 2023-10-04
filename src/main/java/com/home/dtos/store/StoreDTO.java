package com.home.dtos.store;

import com.home.dtos.document.DocumentDTO;
import lombok.Data;

import java.util.List;

@Data
public class StoreDTO {
    private Long id;
    private String name;
    private List<OpeningHoursDTO> openingHours;
    private List<DocumentDTO> documents;
    private long addressId;
    private Long deliverTimeInMinutes;
}
