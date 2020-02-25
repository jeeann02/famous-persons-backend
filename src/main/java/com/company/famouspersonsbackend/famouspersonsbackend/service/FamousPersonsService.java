package com.company.famouspersonsbackend.famouspersonsbackend.service;

import com.company.famouspersonsbackend.famouspersonsbackend.model.mongo.FamousPersons;
import com.company.famouspersonsbackend.famouspersonsbackend.repository.FamousPersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FamousPersonsService {
    @Autowired
    private FamousPersonsRepository famousPersonsRepository;

    //Create Operation
    public String create(FamousPersons famousPersons){
        String uniqueId = null;

        if(uniqueId == null) {
            uniqueId = UUID.randomUUID().toString();
        }

        famousPersons.setId(uniqueId);
        famousPersonsRepository.save(famousPersons);
        return  famousPersons.toString();
    }

    //Retrieve Operation
    public List<FamousPersons> getAllActive(){
        return famousPersonsRepository.findByArchived(false);
    }

    //Update Operation
    public String update(FamousPersons famousPersons, String Id){
        famousPersons.setId(Id);
        famousPersonsRepository.save(famousPersons);
        return famousPersons.toString();
    }

    //Delete Operation
    public String remove(String personId){
        famousPersonsRepository.deleteById(personId);
        return personId;
    }
}
