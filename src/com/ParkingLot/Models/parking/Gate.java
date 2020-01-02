package com.ParkingLot.Models.parking;

import com.ParkingLot.DBObject;
import com.ParkingLot.Models.accounts.Attendant;
import com.ParkingLot.Models.electronics.AutoExitPanel;
import com.ParkingLot.Models.parking.interfaces.PaymentEnabled;

public class Gate extends DBObject implements PaymentEnabled {

    private GateType type;
    private String gateName;
    private Attendant attendant;
    private AutoExitPanel exitPanel;

    void getTicket()
    {

    }

    @Override
    public void processTicket(Ticket ticket) {

    }
}
