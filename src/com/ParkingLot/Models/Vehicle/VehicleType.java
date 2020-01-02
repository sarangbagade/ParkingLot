package com.ParkingLot.Models.Vehicle;

import com.ParkingLot.Models.parking.spots.SpotType;

import java.util.Arrays;
import java.util.List;

public enum VehicleType {
    TRUCK(Arrays.asList(SpotType.LARGE)),
    MOTORCYCLE(Arrays.asList(SpotType.MOTORCYCLE, SpotType.COMPACT, SpotType.LARGE)),
    VAN(Arrays.asList(SpotType.COMPACT, SpotType.LARGE)),
    CAR(Arrays.asList(SpotType.LARGE)),
    ELECTRIC(Arrays.asList(SpotType.ELECTRIC));

    private List<SpotType> fitsIn;

    VehicleType(List<SpotType> fitsIn)
    {
        this.fitsIn = fitsIn;
    }
}
