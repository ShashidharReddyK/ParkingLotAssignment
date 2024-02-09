package com.example.ParkingLotAssignment.commands;

import com.example.ParkingLotAssignment.controllers.ParkingLotController;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class CommandExecutor {
    private List<Command> commands;

    public CommandExecutor(){
        commands = new ArrayList<>();
    }



    public void execute(String input){
        for(Command command: commands){
            if(command.matches(input)){
                command.execute(input);
                break;
            }
        }
    }
}
