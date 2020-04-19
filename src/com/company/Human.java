package com.company;

public class Human {
    private String name;
    private Gender gender;
    private String dateOfBirth;

    public Human(String name, Gender gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    public void printDataSheet(){
        System.out.println("Name: " + name + "\nGeschlecht: " + gender.getName() + "\nGeburtsdatumg: " + dateOfBirth);
    }

    public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
}
