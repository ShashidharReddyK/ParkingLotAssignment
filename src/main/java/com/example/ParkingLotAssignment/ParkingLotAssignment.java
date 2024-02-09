package com.example.ParkingLotAssignment;

import com.example.ParkingLotAssignment.commands.*;
import com.example.ParkingLotAssignment.controllers.ParkingLotController;
import com.example.ParkingLotAssignment.controllers.TicketController;
import com.example.ParkingLotAssignment.repositories.ParkingLotRepository;
import com.example.ParkingLotAssignment.services.ParkingLotService;
import com.example.ParkingLotAssignment.services.TicketService;

import java.util.Scanner;

public class ParkingLotAssignment {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        CommandExecutor commandExecutor = new CommandExecutor();

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        TicketService ticketService = new TicketService(parkingLotRepository);
        TicketController ticketController = new TicketController(ticketService);

        commandExecutor.getCommands().add(new ExitCommand(parkingLotController));
        commandExecutor.getCommands().add(new LeaveCommand(ticketController));
        commandExecutor.getCommands().add(new ParkCommand(ticketController));
        commandExecutor.getCommands().add(new RegisterParkingLot(parkingLotController));
        commandExecutor.getCommands().add(new StatusCommand(parkingLotController));
        commandExecutor.getCommands().add(new CarsByColourCommand(parkingLotController));

        while(true){
            String input = sc.nextLine();

            commandExecutor.execute(input);

            if(input.equals("exit")){
                sc.close();
                System.exit(0);
            }

        }

    }
}