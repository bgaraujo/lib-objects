package com.home.dtos.meal;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class MealDTO {
    private Long id;
    private String name;
    private CuisineTypeDTO cuisineType;
    private BigDecimal price;
    private String description;
    private Boolean available;
    private List<SideDishesDTO> sideDishes;
}
