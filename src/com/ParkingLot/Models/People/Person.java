package com.ParkingLot.Models.People;

import com.ParkingLot.Models.Address;
import com.ParkingLot.DBObject;
import com.ParkingLot.Models.accounts.Account;

public class Person extends DBObject {

    private String name, phoneNumber;
    private Address address;
    private Account account;

    private Person(Builder builder) {
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.account = builder.account;
    }

    public static final class Builder{
        private String name, phoneNumber;
        private Address address;
        private Account account;

        //with this name can be made compulsory to create person class object
        Builder(String name)
        {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public void setAccount(Account account) {
            this.account = account;
        }

        public Person build()
        {
            return new Person(this);
        }
    }
}
