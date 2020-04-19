package com.company;

public class Secretary extends Member {
private String functionOfMember;
    public Secretary(String name, Gender gender, String dateOfBirth, boolean isActive) {
        super(name, gender, dateOfBirth, isActive);
        this.functionOfMember = "Secretary";
        this.membershipFee = 100;
    }

    @Override
    public void printFunctionOfMember() {
        System.out.println("I am the " + this.functionOfMember);
    }
}
