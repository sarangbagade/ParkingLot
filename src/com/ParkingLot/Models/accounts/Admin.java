package com.ParkingLot.Models.accounts;

import com.ParkingLot.Models.People.Person;
import com.ParkingLot.Models.electronics.Electronics;
import com.ParkingLot.Models.parking.Floor;
import com.ParkingLot.Models.parking.Gate;
import com.ParkingLot.Models.parking.Spot;

public class Admin extends Account {

    public Admin(String username, String passwordHash, Person person)
    {
        super(username, passwordHash, person);
    }

    void addFloor(Floor floor)
    {

    }
    void removeFloor(Floor floor)
    {

    }
    void modifyFloor(Floor floor)
    {

    }
    void addSpot(Floor floor, Spot spot)
    {

    }
    void removeSpot(Floor floor, Spot spot)
    {

    }
    void modifySpot(Floor floor, Spot spot)
    {

    }
    void addElectronics(Floor floor, Electronics panel)
    {

    }
    void removeElectronics(Floor floor, Electronics panel)
    {

    }
    void modifyElectronics(Floor floor, Electronics panel)
    {

    }
    void addAttendant(Floor floor, Attendant attendant)
    {

    }
    void removeAttendant(Floor floor, Attendant attendant)
    {

    }
    void addGate(Gate gate)
    {

    }
    void removeGate(Gate gate)
    {

    }
    void modifyGate(Gate gate)
    {

    }
}
