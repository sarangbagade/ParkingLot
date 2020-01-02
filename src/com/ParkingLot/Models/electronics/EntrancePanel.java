package com.ParkingLot.Models.electronics;

import com.ParkingLot.DBObject;
import com.ParkingLot.Models.parking.Ticket;
import com.ParkingLot.Models.parking.interfaces.HasDisplay;
import com.ParkingLot.Models.parking.interfaces.IssuesTicket;

public class EntrancePanel extends Electronics implements HasDisplay, IssuesTicket {

    @Override
    public void displayMessage(String message) {

    }

    @Override
    public Ticket giveTicket() {
        return null;
    }
}
