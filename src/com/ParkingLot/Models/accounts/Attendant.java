package com.ParkingLot.Models.accounts;

import com.ParkingLot.Models.People.Person;
import com.ParkingLot.Models.parking.Ticket;
import com.ParkingLot.Models.parking.interfaces.IssuesTicket;
import com.ParkingLot.Models.parking.interfaces.PaymentEnabled;

public class Attendant extends Account implements PaymentEnabled, IssuesTicket {

    public Attendant(String username, String passwordHash, Person person) {

        super(username, passwordHash, person);
    }

    @Override
    public Ticket giveTicket() {
        return null;
    }

    @Override
    public void processTicket(Ticket ticket) {

    }
}
