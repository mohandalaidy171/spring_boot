package com.muhannad.task2_springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "driver")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driver_id")
    private int driver_id;
    @Column(name = "driver_name")

    private String driver_name;


    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car selectedCar;
}
