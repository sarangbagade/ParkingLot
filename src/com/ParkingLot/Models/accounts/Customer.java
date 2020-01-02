package com.ParkingLot.Models.accounts;

import com.ParkingLot.Models.People.Person;
import com.ParkingLot.Models.parking.Ticket;

public class Customer extends Account{

    public Customer(String username, String passwordHash, Person person)
    {
        super(username, passwordHash, person);
    }
    public Ticket getTicket()
    {
        return null;
    }
    public void payForTicket(Ticket ticket)
    {

    }
}
