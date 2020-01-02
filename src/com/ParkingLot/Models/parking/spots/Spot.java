package com.ParkingLot.Models.parking.spots;
import com.ParkingLot.DBObject;

public class Spot extends DBObject {

    private final SpotType type;
    private SpotStatus status;

    public Spot(SpotType type) {
        this.type = type;
    }
}
