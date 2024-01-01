package com.muhannad.task2_springboot.service;

import com.muhannad.task2_springboot.dto.CarDto;
import com.muhannad.task2_springboot.entity.Car;
import com.muhannad.task2_springboot.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepo;


    public CarService(CarRepository carRepo) {
        this.carRepo = carRepo;
    }

    public Car addCar(CarDto carDto) {

        Car car1=new Car();
        car1.setConvertible(carDto.isConvertible());
        car1.setEngine_type(carDto.getEngine_type());
        car1.setLicense_plate(carDto.getLicense_plate());
        car1.setRating(carDto.getRating());
        car1.setManuf_id(carDto.getManuf_id());
        return carRepo.save(car1);
    }

    public List<Car> getAll() {
        return carRepo.findAll();
    }

    public String deleteCar(int carId) {
        Optional<Car> testId=carRepo.findById(carId);
       if(testId.isPresent()){

           carRepo.deleteById(carId);
           return "Delete Succefuily ";
       }
       else {
           return "id not found ";
       }

    }

    public Car updateCar(int carId, CarDto car) {

        Optional<Car > testId=carRepo.findById(carId);
        if(testId.isPresent()){
            Car car1=new Car();
            car1.setConvertible(car.isConvertible());
            car1.setEngine_type(car.getEngine_type());
            car1.setLicense_plate(car.getLicense_plate());
            car1.setRating(car.getRating());
            car1.setManuf_id(car.getManuf_id());
            return carRepo.save(car1);

        }
        return null;
    }
}
