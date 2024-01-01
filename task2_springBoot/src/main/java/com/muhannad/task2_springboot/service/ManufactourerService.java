package com.muhannad.task2_springboot.service;

import com.muhannad.task2_springboot.dto.ManufactourerDto;
import com.muhannad.task2_springboot.entity.Manufactourer;
import com.muhannad.task2_springboot.repository.ManufactourerRepository;
import org.springframework.stereotype.Service;

@Service
public class ManufactourerService {

private final ManufactourerRepository manufactourerRepository;


    public ManufactourerService(ManufactourerRepository manufactourerRepository) {
        this.manufactourerRepository = manufactourerRepository;
    }

    public Manufactourer addManf(ManufactourerDto manufactourerDto) {

        Manufactourer manf1=new Manufactourer();
        manf1.setName_manufactourer(manufactourerDto.getName_manufactourer());
       return manufactourerRepository.save(manf1);
    }
}
