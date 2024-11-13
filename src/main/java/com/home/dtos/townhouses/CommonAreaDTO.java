package com.home.dtos.townhouses;

import com.home.enums.MaintenanceStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.UUID;

@Data
public class CommonAreaDTO {
    private UUID id;
    private String name;
    private String description;
    private Integer capacity;
    private Boolean availability;
    private LocalTime openingHours;
    private LocalTime closingHours;
    private String rules;
    private MaintenanceStatusEnum maintenanceStatus;
    private String availableResources;
    private BigDecimal reservationFee;
    private String imageUrl;
}
