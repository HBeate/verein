package com.company;

import java.util.ArrayList;

public class Club {
    private String name;
    private String address;
    private ArrayList<Member> members;
    private int countOfMembers;

    public Club(String name, String address) {
        this.name = name;
        this.address = address;
        this.countOfMembers = 0;
        this.members = new ArrayList<>();
    }

public void addMember (Member member){
        this.members.add(member);
}
public int getCountOfMembers(){
        return members.size();
}
}
