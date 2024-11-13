package com.home.dtos.service;

import com.home.enums.ReservationStatusEnum;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ReservationDTO {
    private Long id;
    private UUID personId;
    private Long townhouseId;
    private Long areaId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ReservationStatusEnum status;
    private String specialRequirements;
}
