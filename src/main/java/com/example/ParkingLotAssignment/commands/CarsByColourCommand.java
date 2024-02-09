package com.example.ParkingLotAssignment.commands;

import com.example.ParkingLotAssignment.controllers.ParkingLotController;

public class CarsByColourCommand implements Command{
    private String commandString = "registration_numbers_for_cars_with_colour";

    private ParkingLotController parkingLotController;

    public CarsByColourCommand(ParkingLotController parkingLotController){
        this.parkingLotController = parkingLotController;
    }

    public void execute(String input){
        String[] inputSplit = input.split(" ");
        System.out.println(parkingLotController.getCarsByColour(inputSplit[1]));
    }

    public boolean matches(String input){
        String[] inputSplit = input.split(" ");
        return this.commandString.equals(inputSplit[0]);
    }
}
