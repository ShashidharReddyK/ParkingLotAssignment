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
        try{
            System.out.println(ticketcontroller.parkVehicle(inputSplit[1], inputSplit[2]));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong input format");
            System.out.println("Input command format for parking a car: "+this.commandString+" <registration_number> <colour>");
        }

    }

    public boolean matches(String input){
        String[] inputSplit = input.split(" ");
        return this.commandString.equals(inputSplit[0]);
    }
}
