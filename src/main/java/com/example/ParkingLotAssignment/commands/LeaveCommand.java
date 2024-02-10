package com.example.ParkingLotAssignment.commands;

import com.example.ParkingLotAssignment.controllers.TicketController;

public class LeaveCommand implements Command{
    private String commandString = "leave";

    private TicketController ticketController;

    public LeaveCommand( TicketController ticketController ){
        this.ticketController = ticketController;
    }

    public void execute(String input){
        String[] inputSplit = input.split(" ");
        try{
            System.out.println(ticketController.emptySlot(Integer.valueOf(inputSplit[1])));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong input format \n Input command format for a car exit: "+this.commandString+" <slot number given to you>");
        }

    }

    public boolean matches(String input){
        String[] inputSplit = input.split(" ");
        return this.commandString.equals(inputSplit[0]);
    }
}
