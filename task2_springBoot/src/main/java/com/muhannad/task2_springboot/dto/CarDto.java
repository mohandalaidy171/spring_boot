package com.muhannad.task2_springboot.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {

    private int id ;

    private int manuf_id;

    private int license_plate;

    private  boolean convertible;

    private double rating;

    private String engine_type;
}
