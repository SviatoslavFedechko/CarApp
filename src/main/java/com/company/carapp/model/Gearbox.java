package com.company.carapp.model;

import lombok.Getter;

@Getter
public class Gearbox {

    private DriveMode driveMode;
    private final Engine engine;

    public Gearbox(Engine engine) {
        driveMode = DriveMode.PARK;
        this.engine = engine;
    }

    public void enableDriveMode() {
        driveMode = DriveMode.DRIVE;
    }

    public void enableParkMode() {
        driveMode = DriveMode.PARK;
    }

}
