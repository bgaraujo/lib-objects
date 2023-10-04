package com.home.dtos.meal;

import lombok.Data;

@Data
public class CuisineTypeDTO {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
}
