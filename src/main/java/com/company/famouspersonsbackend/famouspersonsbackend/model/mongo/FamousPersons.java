package com.company.famouspersonsbackend.famouspersonsbackend.model.mongo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "famousPersons")
public class FamousPersons {
    @Id
    private String Id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private String gender;
    private Date birthDate;
    private String occupation;
    private String citizenship;
    private String bio;
    private int age;
    private boolean archived;
    private Date createdDatetime;
    private Date modifiedDatetime;

    public FamousPersons(
            String firstName,
            String middleName,
            String lastName,
            String fullName,
            String gender,
            String occupation,
            String citizenship,
            String bio,
            int age,
            Date birthDate,
            Date createdDatetime,
            Date modifiedDatetime,
            boolean archived
    ){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.gender = gender;
        this.occupation = occupation;
        this.citizenship = citizenship;
        this.bio = bio;
        this.age = age;
        this.birthDate = birthDate;
        this.createdDatetime = createdDatetime;
        this.modifiedDatetime = modifiedDatetime;
        this.archived = archived;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getModifiedDatetime() {
        return modifiedDatetime;
    }

    public void setModifiedDatetime(Date modifiedDatetime) {
        this.modifiedDatetime = modifiedDatetime;
    }

    @Override
    public String toString() {
        return "FamousPersons{" +
                "id='" + Id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", occupation=" + occupation +
                ", citizenship=" + citizenship +
                ", bio=" + bio +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", createdDatetime=" + createdDatetime +
                ", modifiedDatetime=" + modifiedDatetime +
                ", archived=" + archived +
                '}';
    }


}
