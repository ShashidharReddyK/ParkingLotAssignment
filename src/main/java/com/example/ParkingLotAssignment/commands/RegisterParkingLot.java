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
        try{
            int numberOfSlots = Integer.valueOf(inputSplit[1]);
            System.out.println(parkingLotController.registerParkingLot(numberOfSlots));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong input format");
            System.out.println("Input command format for creating a parking lot:  "+this.commandString+" <numberOfSlots> ");
        }
    }

    @Override
    public boolean matches(String input) {
        String[] inputSplit = input.split(" ");
        return this.commandString.equals(inputSplit[0]);
    }
}
