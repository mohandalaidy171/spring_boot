package com.muhannad.task2_springboot.repository;

import com.muhannad.task2_springboot.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface CarRepository extends JpaRepository<Car,Integer> {
}
