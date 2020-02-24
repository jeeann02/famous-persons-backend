package controller;

import com.company.famouspersonsbackend.famouspersonsbackend.model.mongo.FamousPersons;
import com.company.famouspersonsbackend.famouspersonsbackend.repository.FamousPersonsRepository;
import com.company.famouspersonsbackend.famouspersonsbackend.service.FamousPersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class FamousPersonsController {

    @Autowired
    private FamousPersonsService famousPersonsService;
    private FamousPersonsRepository famousPersonsRepository;

    @PostMapping("/addPerson")
    public String savePerson(@RequestBody FamousPersons famousPersons){
        famousPersonsRepository.save(famousPersons);
        return famousPersons.toString();
    }

    @GetMapping("/getAllFamousPersons")
    public List<FamousPersons> getAllFamousPersons(){
        return famousPersonsService.getAllActive();
    }
}
