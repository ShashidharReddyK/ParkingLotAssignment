package com.example.ParkingLotAssignment.commands;

import com.example.ParkingLotAssignment.controllers.ParkingLotController;

public class ExitCommand implements Command{
    private String commandString = "exit";

    private ParkingLotController parkingLotController;

    public ExitCommand(ParkingLotController parkingLotController){
        this.parkingLotController = parkingLotController;
    }

    public void execute(String input){
        parkingLotController.exitParkingLot();
    }

    public boolean matches(String input){
        return this.commandString.equals(input);
    }
}
