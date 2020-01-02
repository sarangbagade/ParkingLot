package com.ParkingLot.Models.parking.spots;

import com.ParkingLot.Models.electronics.ChargingPanel;

public class ElectricSpot extends Spot {

    private ChargingPanel panel;
    public ElectricSpot(SpotType type) {
        super(type);
    }
}
