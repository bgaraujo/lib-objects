package com.home.dtos.address;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddressDTO {
    private Long id;
    private String name;
    private String postalCode;
    private String street;
    private Long number;
    private String state;
    private String city;
    private String complement;
    private BigDecimal lat;
    private BigDecimal lng;
}
