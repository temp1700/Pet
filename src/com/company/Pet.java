package com.company;

import java.time.LocalDate;

public class Pet {

    String breed;
    String name;
    LocalDate birthdate;

    public enum typeOfAnimal {
        Dog,
        Cat,
        Bird;
    }

    

    public Pet (String petBreed, String getName, LocalDate birthdate) {
        breed = petBreed;
        name = getName;
        this.birthdate = birthdate;
    }


    public int getAge() {
        LocalDate now = LocalDate.now();
        int years = now.getYear() - birthdate.getYear();

        //Figure out the age from the month and year of now and birthdate.
        if (birthdate.getMonthValue() > now.getMonthValue()) {
            years--;
        }

        return years;
    }



    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedsRestraint() {
        return getAge() < 13;
    }



    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + getAge() +
                ", needsRestraint=" + isNeedsRestraint() +
                ", birthdate=" + birthdate +
                '}';

    }
}
