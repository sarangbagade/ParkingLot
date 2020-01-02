package com.ParkingLot.Models.parking;

import com.ParkingLot.DBObject;
import com.ParkingLot.Models.electronics.CustomerInfoPortal;
import com.ParkingLot.Models.electronics.DisplayBoard;

import java.util.List;

public class Floor extends DBObject {

    private CustomerInfoPortal infoPortal;
    private DisplayBoard board;
    private List<Spot> spots;
}
