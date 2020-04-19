package com.company;

public class Treasurer extends Member {
private String functionOfMember;

    public Treasurer(String name, Gender gender, String dateOfBirth, boolean isActive) {
        super(name, gender, dateOfBirth, isActive);
        this.functionOfMember = "Treasurer";
        this.membershipFee = 0;

    }
    @Override
    public void printFunctionOfMember() {
        System.out.println("I am the " + this.functionOfMember);
    }
public void collectMembershipFee(){
    System.out.println("Bitte gebt mir euren Mitgliedbeitrag.");
}

}
