package com.example.ParkingLotAssignment.controllers;

import com.example.ParkingLotAssignment.ParkingLotAssignment;
import com.example.ParkingLotAssignment.models.ParkingLot;
import com.example.ParkingLotAssignment.services.ParkingLotService;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService){
        this.parkingLotService = parkingLotService;
    }

    public String registerParkingLot(int numberOfSlots){
        return parkingLotService.createParkingLot(numberOfSlots);
    }

    public void parkingLotStatus(){
        parkingLotService.parkingLotStatus();
    }

    public void exitParkingLot(){
        parkingLotService.exitParkingLot();
    }

    public String getCarsByColour(String colour){
        return parkingLotService.getCarsByColour(colour);
    }
}
