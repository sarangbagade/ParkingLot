package com.ParkingLot.Models.accounts;
import com.ParkingLot.DBObject;
import com.ParkingLot.Models.People.Person;

public abstract class Account extends DBObject {

    private String username, saltedPasswordHash;
    private final Person person;
    private AccountStatus status;

    public Account(String username, String passwordHash, Person person)
    {
        this.username = username;
        this.saltedPasswordHash = passwordHash;
        this.person = person;
        this.status = AccountStatus.ACTIVE;
    }
}
