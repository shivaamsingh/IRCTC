package org.example;

import java.util.List;

import IRCTC.app.src.main.java.org.example.Ticket;

public class User {

    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public User(String name, String password, String hashPassword, List<Ticket>ticketBooked,String userId){
        this.name=name;
        this.password=password;
        this.hashPassword=hashPassword;
        this.ticketsBooked=ticketBooked;
        this.userId=userId;
    }


    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return password;
    }
    public String getHashPassword(){return hashPassword;}

    public List<Ticket>getTicketBooked(){return ticketsBooked;}

    public void printTicket(){
        for (int i = 0; i < ticketsBooked.size(); i++) {
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId(){return userId;}

    public void setName(String name){this.name=name;}

    public void setHashPassword(String hashPassword){this.hashPassword=hashPassword;}

    public void setTicketsBooked(List<Ticket>ticketBooked){
        this.ticketsBooked=ticketBooked;
    }
    public void setUserId(String userId){
        this.userId=userId;
    }


}
