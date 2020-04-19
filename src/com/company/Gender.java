package com.company;

public enum Gender {
    MALE("männlich"),
    FEMALE("weiblich");

    private String name;

//constructor
    Gender(String name) {
        this.name = name;
    }
//Getter
    public String getName() {
        return this.name;
    }

}

