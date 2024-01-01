package com.muhannad.task2_springboot.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "car")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;
    @Column(name = "manuf_id")
    private int manuf_id;
    @Column(name = "license_plate")

    private int license_plate;
    @Column(name = "convertible")

    private  boolean convertible;
    @Column(name = "rating")

    private double rating;
    private String engine_type;

    @ManyToOne()
    @JsonManagedReference
    @JoinColumn(name = "manuf_id",insertable = false,updatable = false)
    private Manufactourer  manuf;
}
