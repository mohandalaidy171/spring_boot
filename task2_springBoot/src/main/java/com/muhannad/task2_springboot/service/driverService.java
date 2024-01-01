package com.muhannad.task2_springboot.service;

import com.muhannad.task2_springboot.CarAlreadyInUseException;
import com.muhannad.task2_springboot.entity.Car;
import com.muhannad.task2_springboot.entity.Driver;
import com.muhannad.task2_springboot.repository.CarRepository;
import com.muhannad.task2_springboot.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class driverService {
private final CarRepository carRepo;
private final DriverRepository driverRepo;
    public driverService(CarRepository carRepo, DriverRepository driverRepo) {
        this.carRepo = carRepo;
        this.driverRepo = driverRepo;
    }

    public  void selectCar(int driverId, int carId) {
        Optional<Driver> driver= driverRepo.findById(carId);
       Optional<Car> car1=carRepo.findById(carId);
        Driver driver2=new Driver();
        if (driver2.getSelectedCar() != null) {
            throw new CarAlreadyInUseException("Driver already has a selected car");
        }

        driver2.setSelectedCar(car1.get());
        driverRepo.save(driver.get());

    }
    public void deselectCar(int driverId) {
        Optional<Driver> driver= driverRepo.findById(driverId);
        Driver driver1=new Driver();
        driver1.setSelectedCar(null);
        driverRepo.save(driver1);
    }
}
