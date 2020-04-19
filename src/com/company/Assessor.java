package com.company;

public class Assessor extends  Member {
 private String functionOfMember;
    public Assessor(String name, Gender gender, String dateOfBirth, boolean isActive) {
        super(name, gender, dateOfBirth, isActive);
        this.functionOfMember = "Assessor";
        this.membershipFee = 150;
    }

    @Override
    public void printFunctionOfMember() {
        System.out.println("I am the " + this.functionOfMember);
    }
}
