package com.example.ParkingLotAssignment.commands;

import com.example.ParkingLotAssignment.controllers.ParkingLotController;

public class StatusCommand implements Command{
    private String commandString = "status";

    private ParkingLotController parkingLotController;

    public StatusCommand(ParkingLotController parkingLotController){
        this.parkingLotController = parkingLotController;
    }

    public void execute(String input){
        parkingLotController.parkingLotStatus();
    }

    public boolean matches(String input){
        return this.commandString.equals(input);
    }
}
