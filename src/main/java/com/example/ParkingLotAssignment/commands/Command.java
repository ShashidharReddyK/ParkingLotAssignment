package com.example.ParkingLotAssignment.commands;

public interface Command {
    void execute(String input);

    boolean matches(String input);
}
