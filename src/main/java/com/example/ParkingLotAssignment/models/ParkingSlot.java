package com.example.ParkingLotAssignment.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSlot extends BaseEntity{
    private int parkingSlotNumber;
    private SlotStatus slotStatus;
    private Vehicle vehicle;

    public ParkingSlot(int parkingSlotNumber){
        this.parkingSlotNumber = parkingSlotNumber;
        this.slotStatus = SlotStatus.AVAILABLE;
    }
}
