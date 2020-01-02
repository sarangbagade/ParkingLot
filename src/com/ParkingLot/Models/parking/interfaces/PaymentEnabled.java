package com.ParkingLot.Models.parking.interfaces;

import com.ParkingLot.Models.parking.Ticket;

public interface PaymentEnabled {

    public void processTicket(Ticket ticket);

}
