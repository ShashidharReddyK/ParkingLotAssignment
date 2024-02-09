package com.example.ParkingLotAssignment.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.zip.DataFormatException;

@Getter
@Setter
public class Ticket extends BaseEntity{
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;
    private Date entryTime;
}
