package com.company.famouspersonsbackend.famouspersonsbackend.repository;


import com.company.famouspersonsbackend.famouspersonsbackend.model.mongo.FamousPersons;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamousPersonsRepository extends MongoRepository<FamousPersons, String> {
    public FamousPersons findByFullName(String fullName);
    public List<FamousPersons> findByArchived(boolean archived);
}

