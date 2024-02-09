package com.example.ParkingLotAssignment.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseEntity{
    private Integer numberOfSlots;
    private List<ParkingSlot> parkingSlotList;

    public ParkingLot(int numberOfSlots){
        this.numberOfSlots = numberOfSlots;
        parkingSlotList = new ArrayList<>();

        for(int i=0;i<numberOfSlots;i++){
            parkingSlotList.add(new ParkingSlot(i+1));
        }
    }
}
