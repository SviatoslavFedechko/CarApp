package com.company.model.gearbox;

import lombok.Builder;

@Builder
public class Gearbox {

    private DriveMode driveMode;

    public void enableDriveMode() {
        this.driveMode = DriveMode.DRIVE;
    }
}
