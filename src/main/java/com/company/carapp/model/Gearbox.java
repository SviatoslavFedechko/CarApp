package com.company.carapp.model;

import lombok.Builder;

@Builder
public class Gearbox {

    private DriveMode driveMode;
    private GasPedal gasPedal;
    private Engine engine;

    public Gearbox(DriveMode driveMode, GasPedal gasPedal, Engine engine) {
        this.driveMode = DriveMode.PARK;
        this.gasPedal = gasPedal;
        this.engine = engine;
    }

    public void enableDriveMode() {
        this.driveMode = DriveMode.DRIVE;
    }

    public void enableParkMode() {
        if (gasPedal.isPressed() && engine.isOn()) {
            throw new IllegalStateException("Error: You just tried to put the car in park while it was moving forward!");
        }
        this.driveMode = DriveMode.PARK;
    }

    public void enableReverseMode() {
        this.driveMode = DriveMode.REVERSE;
    }
}
