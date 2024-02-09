package com.example.ParkingLotAssignment.commands;

import com.example.ParkingLotAssignment.controllers.ParkingLotController;
import com.example.ParkingLotAssignment.controllers.TicketController;

public class RegisterParkingLot implements Command{
    private String commandString = "create_parking_lot";
    private ParkingLotController parkingLotController;

    public RegisterParkingLot(ParkingLotController parkingLotController){
        this.parkingLotController = parkingLotController;
    }

    public void execute(String input){
        String[] inputSplit = input.split(" ");
        int numberOfSlots = Integer.valueOf(inputSplit[1]);
        System.out.println(parkingLotController.registerParkingLot(numberOfSlots));
    }

    @Override
    public boolean matches(String input) {
        String[] inputSplit = input.split(" ");
        return this.commandString.equals(inputSplit[0]);
    }
}
