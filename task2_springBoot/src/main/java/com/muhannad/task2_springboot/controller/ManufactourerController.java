package com.muhannad.task2_springboot.controller;

import com.muhannad.task2_springboot.dto.ManufactourerDto;
import com.muhannad.task2_springboot.entity.Manufactourer;
import com.muhannad.task2_springboot.service.ManufactourerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manf/")
public class ManufactourerController {
    private final ManufactourerService manufactourerService;

    public ManufactourerController(ManufactourerService manufactourerService) {
        this.manufactourerService = manufactourerService;
    }
    @PostMapping("addmanf")
    public ResponseEntity<Manufactourer> addManuf(@RequestBody ManufactourerDto manufactourerDto){
        Manufactourer manf1=manufactourerService.addManf(manufactourerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(manf1);

    }
}
