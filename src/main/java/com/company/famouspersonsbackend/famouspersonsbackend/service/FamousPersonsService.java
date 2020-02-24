package com.company.famouspersonsbackend.famouspersonsbackend.service;

import com.company.famouspersonsbackend.famouspersonsbackend.model.mongo.FamousPersons;
import com.company.famouspersonsbackend.famouspersonsbackend.repository.FamousPersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FamousPersonsService {
    @Autowired
    private FamousPersonsRepository famousPersonsRepository;

    //Create Operation
    public FamousPersons create(String firstName, String middleName, String lastName, String fullName, String gender, String occupation, String citizenship, String bio, int age, Date birthDate, Date createdDatetime, Date modifiedDatetime, boolean archived){
        return famousPersonsRepository.save(new FamousPersons(firstName, middleName, lastName, fullName, gender, occupation, citizenship, bio, age, birthDate, createdDatetime, modifiedDatetime, archived));
    }

    //Retrieve Operation
    public List<FamousPersons> getAllActive(){
        return famousPersonsRepository.findByArchived(false);
    }

    //Update Operation
    public FamousPersons update(String firstName, String middleName, String lastName,String fullName, String gender, String occupation, String citizenship, String bio, int age, Date birthDate, Date modifiedDatetime, boolean archived){
        FamousPersons person = famousPersonsRepository.findByFullName(fullName);
        person.setFirstName(firstName);
        person.setMiddleName(middleName);
        person.setLastName(lastName);
        person.setFullName(fullName);
        person.setGender(occupation);
        person.setCitizenship(citizenship);
        person.setBio(bio);
        person.setAge(age);
        person.setBirthDate(birthDate);
        person.setModifiedDatetime(modifiedDatetime);
        person.setArchived(archived);
        return famousPersonsRepository.save(person);
    }
}
