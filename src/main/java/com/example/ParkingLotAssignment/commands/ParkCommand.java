package com.example.ParkingLotAssignment.commands;

import com.example.ParkingLotAssignment.controllers.ParkingLotController;
import com.example.ParkingLotAssignment.controllers.TicketController;

public class ParkCommand implements Command{
    private String commandString = "park";
    private TicketController ticketcontroller;
    private ParkingLotController parkingLotController;

    public ParkCommand(TicketController ticketcontroller){
        this.ticketcontroller = ticketcontroller;
    }

    public void execute(String input){
        String[] inputSplit = input.split(" " );
        System.out.println(ticketcontroller.parkVehicle(inputSplit[1], inputSplit[2]));
    }

    public boolean matches(String input){
        String[] inputSplit = input.split(" ");
        return this.commandString.equals(inputSplit[0]);
    }
}
