package com.example.ParkingLotAssignment.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseEntity{
    private String registrationNumber;
    private String colour;

    public Vehicle(String registrationNumber, String colour){
        this.registrationNumber = registrationNumber;
        this.colour = colour;
    }

    public String getString(){
        return this.registrationNumber+" "+this.colour;
    }
}
