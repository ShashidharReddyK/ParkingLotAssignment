package com.example.ParkingLotAssignment.services;

import com.example.ParkingLotAssignment.models.ParkingLot;
import com.example.ParkingLotAssignment.models.ParkingSlot;
import com.example.ParkingLotAssignment.models.SlotStatus;
import com.example.ParkingLotAssignment.repositories.ParkingLotRepository;

import java.util.List;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }

    public String createParkingLot(int numberOfSlots){
        return parkingLotRepository.initiate(numberOfSlots);
    }

    public void parkingLotStatus(){
        ParkingLot parkingLot = parkingLotRepository.getParkingLot();
        System.out.println("Slot No.  Registration No.  Colour ");
        for(ParkingSlot parkingSlot: parkingLot.getParkingSlotList()){
            if(parkingSlot.getSlotStatus()== SlotStatus.FILLED){
                System.out.println(parkingSlot.getParkingSlotNumber()+"  "+parkingSlot.getVehicle().getString());
            }
        }
    }

    public void exitParkingLot(){
        parkingLotRepository.setParkingLot(null);
    }

    public String getCarsByColour(String colour){
        List<String> vehicles = parkingLotRepository.getCarsByColour(colour);

        StringBuffer result = null;

        for(String vehicle: vehicles){
            if(result != null){
                result.append(", ");
            }
            else{
                result = new StringBuffer("");
            }
            result.append(vehicle);
        }
        return result.toString();
    }
}
