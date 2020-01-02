package com.ParkingLot.Models.electronics;

import com.ParkingLot.DBObject;
import com.ParkingLot.Models.parking.Ticket;
import com.ParkingLot.Models.parking.interfaces.PaymentEnabled;

public class CustomerInfoPortal extends Electronics implements PaymentEnabled {

    @Override
    public void processTicket(Ticket ticket) {

    }
}
