package com.muhannad.task2_springboot.controller;

import com.muhannad.task2_springboot.entity.Driver;
import com.muhannad.task2_springboot.service.CarService;
import com.muhannad.task2_springboot.service.driverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver/")
public class DriverController {

    private final driverService driverservice;

    public DriverController(driverService driverservice) {
        this.driverservice = driverservice;

    }

    @PutMapping("/{driverId}/select-car/{carId}")
    public ResponseEntity<Void> selectCar(@RequestParam int driverId, @RequestParam int carId) {
        driverservice.selectCar(driverId, carId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{driverId}/deselect-car")
    public ResponseEntity<Void> deselectCar(@RequestParam int driverId) {
        driverservice.deselectCar(driverId);
        return ResponseEntity.noContent().build();
    }
}
