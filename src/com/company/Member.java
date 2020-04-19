package com.company;

public class Member extends Human {
    private String functionOfMember;
    protected double membershipFee;
    private boolean isActive;

    public Member(String name, Gender gender, String dateOfBirth, boolean isActive) {
        super(name, gender, dateOfBirth);
        this.membershipFee = 200;
        this.isActive = isActive;
        this.functionOfMember = "Mitglied";
    }

    public void printMembershipFee() {
        System.out.println("Der Mitgliedbeitrag beträgt " + membershipFee + " Euro.");
    }

    public void printDataSheet() {
        System.out.println("Name: " + getName() + "\nGender: " + getGender().getName() + "\nGeburtsdatum: "
                + getDateOfBirth() + "\nAktives Mitglied: " + isActive + "\nFunktion: "+ functionOfMember
        + "\nMembership Fee: " + membershipFee);
    }

    public void printFunctionOfMember() {
        System.out.println("I am a " + functionOfMember);
    }
    public void payMembershipFee(){
        System.out.println("Mitgliedsbeitrag von " + membershipFee + " ist bezahlt.");
    }
}
