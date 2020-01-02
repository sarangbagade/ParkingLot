package com.ParkingLot.Models;

public class Address {

    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String streetAddress;

    private Address(Builder builder) {

        this.country = builder.country;
        this.state = builder.state;
        this.city = builder.state;
        this.zipCode = builder.zipCode;
        this.streetAddress = builder.streetAddress;
    }

    public static final class Builder {
        private String country;
        private String state;
        private String city;
        private String zipCode;
        private String streetAddress;

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Address build()
        {
            //this default value can be set using the builder pattern
            if(this.country == null){
                this.country = "India";
            }
            return new Address(this);
        }
    }
}
