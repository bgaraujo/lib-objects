package com.home.dtos.service;

import com.home.enums.ReservationStatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationDTO {
    private Long id;
    private Long personId;
    private Long areaId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ReservationStatusEnum status;
    private String specialRequirements;
}
