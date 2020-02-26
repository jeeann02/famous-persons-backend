package com.company.famouspersonsbackend.famouspersonsbackend.controller;

import com.company.famouspersonsbackend.famouspersonsbackend.model.mongo.FamousPersons;
import com.company.famouspersonsbackend.famouspersonsbackend.service.FamousPersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<FamousPersons> getAllFamousPersons(){
        return famousPersonsService.getAllFamousPersons();
    }

    @GetMapping("/getFamousPerson/{personId}")
    public Optional<FamousPersons> getFamousPerson(@PathVariable String personId){
        Optional<FamousPersons> famousPerson = famousPersonsService.getFamousPersonById(personId);
        return famousPerson;
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
