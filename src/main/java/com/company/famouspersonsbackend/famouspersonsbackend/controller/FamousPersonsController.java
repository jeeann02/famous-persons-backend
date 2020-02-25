package com.company.famouspersonsbackend.famouspersonsbackend.controller;

import com.company.famouspersonsbackend.famouspersonsbackend.model.mongo.FamousPersons;
import com.company.famouspersonsbackend.famouspersonsbackend.service.FamousPersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class FamousPersonsController {

    @Autowired
    private FamousPersonsService famousPersonsService;

    @PostMapping("/addPerson")
    public String addPerson(@RequestBody FamousPersons famousPersons){
        return famousPersonsService.create(famousPersons);
    }

    @GetMapping("/getAllFamousPersons")
    public Iterable<FamousPersons> getAllFamousPersons(){
        return famousPersonsService.getAllActive();
    }

    @PutMapping("/editPerson/{personId}")
    public String editPerson(@RequestBody FamousPersons famousPersons, @PathVariable String personId) {
        return famousPersonsService.update(famousPersons, personId);
    }

    @DeleteMapping("/deletePerson/{personId}")
    public String deletePerson(@PathVariable String personId) {
        return famousPersonsService.remove(personId);
    }
}
