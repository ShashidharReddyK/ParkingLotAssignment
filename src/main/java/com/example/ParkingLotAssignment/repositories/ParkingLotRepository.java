package com.example.ParkingLotAssignment.repositories;

import com.example.ParkingLotAssignment.models.ParkingLot;
import com.example.ParkingLotAssignment.models.ParkingSlot;
import com.example.ParkingLotAssignment.models.SlotStatus;
import com.example.ParkingLotAssignment.models.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingLotRepository {
    private ParkingLot parkingLot;

    public String initiate(int numberOfSlots){
        this.parkingLot = new ParkingLot(numberOfSlots);

        return "Created a parking lot with "+numberOfSlots+" slots";
    }

    public int findAvailableSlot(){
        for(ParkingSlot parkingSlot: parkingLot.getParkingSlotList()){
            if(parkingSlot.getSlotStatus() == SlotStatus.AVAILABLE){
                return parkingSlot.getParkingSlotNumber();
            }
        }
        return 0;
    }

    public void bookSlot(int parkingSlotNumber, Vehicle vehicle){
        for(ParkingSlot parkingSlot: parkingLot.getParkingSlotList()){
            if(parkingSlot.getParkingSlotNumber() == parkingSlotNumber){
                parkingSlot.setSlotStatus(SlotStatus.FILLED);
                parkingSlot.setVehicle(vehicle);
            }
        }
    }

    public void emptySlot(int parkingSlotNumber){
        for(ParkingSlot parkingSlot: parkingLot.getParkingSlotList()){
            if(parkingSlot.getParkingSlotNumber()==parkingSlotNumber){
                parkingSlot.setSlotStatus(SlotStatus.AVAILABLE);
                parkingSlot.setVehicle(null);
                return;
            }
        }
    }

    public List<String> getCarsByColour(String colour){
        List<String> result = new ArrayList<>();
        for(ParkingSlot parkingSlot: parkingLot.getParkingSlotList()){
            if(parkingSlot.getSlotStatus()==SlotStatus.FILLED && parkingSlot.getVehicle().getColour().equals(colour)){
                result.add(parkingSlot.getVehicle().getRegistrationNumber());
            }
        }
        return result;
    }
}
