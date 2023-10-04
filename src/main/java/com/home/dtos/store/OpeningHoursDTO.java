package com.home.dtos.store;

import lombok.Data;

import java.time.LocalTime;

@Data
public class OpeningHoursDTO {
    private Long id;
    private Long weekDay;
    private LocalTime opensAt;
    private LocalTime closesAt;
}
