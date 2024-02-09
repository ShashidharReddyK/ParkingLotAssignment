package com.example.ParkingLotAssignment.controllers;

import com.example.ParkingLotAssignment.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public String parkVehicle(String registrationNumber, String colour){
        return ticketService.parkVehicle(registrationNumber, colour);
    }

    public String emptySlot(int parkingSlotNumber){
        return ticketService.emptySlot(parkingSlotNumber);
    }
}
