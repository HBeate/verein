package com.company;

public class ViceChairperson extends Chairperson {


    public ViceChairperson(String name, Gender gender, String dateOfBirth, boolean isActive) {
        super(name, gender, dateOfBirth, isActive);
        super.determineTitle();
        this.membershipFee = 0;

    }    @Override
    public void printFunctionOfMember() {
        System.out.println("I am the Vice" + getFunctionOfMember());
    }
}


