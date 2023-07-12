package com.ecole221.microsdervices.course.second.service.controller;

import com.ecole221.l3devweb.common.service.dto.PersonneAgeDto;
import com.ecole221.microsdervices.course.second.service.service.AgeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController

public class PersonneController {
    private final AgeService ageService;

    public PersonneController(AgeService ageService) {
        this.ageService = ageService;
    }


    @GetMapping("/age/list")
    @ResponseBody
    public ResponseEntity findAll(){
        List<PersonneAgeDto> ages = ageService.findAll();
        return new ResponseEntity(ages, HttpStatus.OK);
    }

    @GetMapping("/age/{personneId}")
    @ResponseBody
    public ResponseEntity find(@PathVariable UUID personneId){
        PersonneAgeDto ageDTO = ageService.find(personneId);
        return new ResponseEntity(ageDTO, HttpStatus.OK);
    }
}
