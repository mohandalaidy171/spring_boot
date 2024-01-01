package com.muhannad.task2_springboot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "manufactourer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Manufactourer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manuf_id")
    private int manuf_id;
    @Column(name = "name_manufactourer")

    private String name_manufactourer;

    @OneToMany(mappedBy = "manuf")
    @JsonBackReference

    private List<Car> car;
}
