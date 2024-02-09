package com.example.ParkingLotAssignment.services;

import com.example.ParkingLotAssignment.controllers.TicketController;
import com.example.ParkingLotAssignment.models.Vehicle;
import com.example.ParkingLotAssignment.repositories.ParkingLotRepository;

public class TicketService {
    private ParkingLotRepository parkingLotRepository;

    public TicketService(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }

    public String parkVehicle(String registrationNumber, String colour){
        int availableSlot = parkingLotRepository.findAvailableSlot();
        if(availableSlot == 0){
            return "Sorry, parking lot is full";
        }
        Vehicle vehicle = new Vehicle(registrationNumber, colour);
        parkingLotRepository.bookSlot(availableSlot, vehicle);
        return "Allocated slot number: "+availableSlot;
    }

    public String emptySlot(int parkingSlotNumber){
        parkingLotRepository.emptySlot(parkingSlotNumber);

        return "Slot number "+parkingSlotNumber+" is free";
    }

}
