package com.ParkingLot.Models.Vehicle;

import com.ParkingLot.DBObject;

public abstract class Vehicle extends DBObject {

    private final VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }
}
