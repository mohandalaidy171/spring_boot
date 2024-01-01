package com.muhannad.task2_springboot.controller;

import com.muhannad.task2_springboot.dto.CarDto;
import com.muhannad.task2_springboot.entity.Car;
import com.muhannad.task2_springboot.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car/")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("add")
    public ResponseEntity<Car> addCar(@RequestBody CarDto carDto){

        Car car1=carService.addCar(carDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(car1);

    }
    @GetMapping("all")
    public ResponseEntity<List<Car>> getAll(){
        return ResponseEntity.ok(carService.getAll());
    }


    @DeleteMapping("/delete/{carId}")
    public ResponseEntity<String> deleteCar(@RequestParam int carId) {

        return ResponseEntity.ok(carService.deleteCar(carId));
    }

    @PutMapping("/update/{carId}")
    public ResponseEntity<Car> updateCar(@RequestParam int carId, @RequestBody CarDto car) {
        Car updatedCar = carService.updateCar(carId, car);
        return ResponseEntity.ok(updatedCar);
    }
}
