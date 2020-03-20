package com.example.actuator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.log4j.Log4j2;

import com.example.actuator.models.*;
import com.example.actuator.service.*;

@Log4j2
@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/pets")
    public ResponseEntity<Pet> addPet(@RequestHeader("userId") Integer userID, @RequestBody Pet pet) {
        petService.addPet(pet);
        log.debug(userID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/pets/{petId}")
    public ResponseEntity<Pet> getPet(@RequestHeader("userId") Integer userID, @PathVariable("petId") Integer petId) {
        Pet pet = petService.getPet(petId);
        log.debug(userID);
        return new ResponseEntity<Pet>(pet, HttpStatus.OK);
    }

    @GetMapping("/pets")
    public List<Pet> getAllPet(@RequestHeader("userId") Integer userID) {
        log.debug(userID);
        return petService.getAllPet();
    }

    @PutMapping("/pets/{petId}")
    public ResponseEntity<Object> updatePet(@RequestHeader("userId") String userID, @PathVariable("petId") Integer petId, @RequestBody Pet pet){
        log.debug(userID);
        petService.updatePet(petId, pet);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/pets/{petId}")
    public ResponseEntity<Object> deletePet(@RequestHeader("userId") String userID, @PathVariable("petId") Integer petId){
        log.debug(userID);
        petService.deletePet(petId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}