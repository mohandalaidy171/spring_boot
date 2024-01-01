package com.muhannad.task2_springboot.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManufactourerDto {
    private int manuf_id;

    private String name_manufactourer;
}
