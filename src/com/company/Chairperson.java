package com.company;

public class Chairperson extends Member {
    private String functionOfMember;

    public Chairperson(String name, Gender gender, String dateOfBirth, boolean isActive) {
        super(name, gender, dateOfBirth, isActive);
        determineTitle();
        this.membershipFee = 0;
    }

    public String getFunctionOfMember() {
        return functionOfMember;
    }

    public void holdConference() {
        System.out.println("We are having a club meeting");
    }

    public String determineTitle() {
        if (getGender() == Gender.MALE) this.functionOfMember = "Chairman";
        else if (getGender() == Gender.FEMALE) this.functionOfMember = "Chairwoman";
        return functionOfMember;

    }

    @Override
    public void printFunctionOfMember() {
        System.out.println("I am the " + functionOfMember);
    }
}
