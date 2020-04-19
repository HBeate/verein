package com.company;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Paula", Gender.FEMALE, "20.03.1982");
        Member member1 = new Member("Paul", Gender.MALE, "16.01.1998", true);
        Member member2 = new Member("Martina", Gender.FEMALE, "28.11.2002", false);

        Chairperson chairperson1 = new Chairperson("Karin",Gender.FEMALE,"27.12.2067", true );
        ViceChairperson viceChairperson = new ViceChairperson("Wolfgang", Gender.MALE, "17.09.2000", true);
        Secretary secretary1 = new Secretary("Sarah", Gender.FEMALE, "01.10.1964", true);
        Treasurer treasurer1 = new Treasurer ("Joseph", Gender.MALE, "31.12.1972", true);
        Assessor assessor1 = new Assessor("Linda", Gender.FEMALE, "7.5.2005", true);
        Club SoccerClub = new Club("Blau-Weiss Feldkirch", "Hauptstrasse 10");


        member1.printFunctionOfMember();
        member1.printDataSheet();
        member1.payMembershipFee();
        System.out.println();
        human1.printDataSheet();
        System.out.println( "Function: " + chairperson1.getFunctionOfMember());
        chairperson1.printFunctionOfMember();
        chairperson1.holdConference();
        System.out.println();
        viceChairperson.printDataSheet();
        viceChairperson.printFunctionOfMember();
        System.out.println( "Function: Vice " + viceChairperson.getFunctionOfMember());
        System.out.println();
        secretary1.printFunctionOfMember();
        secretary1.printDataSheet();
        secretary1.printMembershipFee();
        System.out.println();
        treasurer1.printFunctionOfMember();
        treasurer1.printDataSheet();
        treasurer1.collectMembershipFee();
        treasurer1.payMembershipFee();

        SoccerClub.addMember(member1);
        SoccerClub.addMember(chairperson1);
        SoccerClub.addMember(viceChairperson);
        SoccerClub.addMember(secretary1);
        SoccerClub.addMember(treasurer1);
        SoccerClub.addMember(member2);
        SoccerClub.addMember(assessor1);
        System.out.println("Members: " + SoccerClub.getCountOfMembers());



    }
}
