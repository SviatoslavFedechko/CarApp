package com.company;

import static com.company.utills.ActionValidation.validateMovingAction;

import com.company.model.engine.CarEngine;
import com.company.model.engine.Engine;
import com.company.model.gearbox.DriveMode;
import com.company.model.gearbox.Gearbox;
import com.company.model.wheels.CarWheels;
import com.company.model.wheels.Wheels;
import lombok.Data;

@Data
public class Car {

    private Engine engine;
    private Wheels wheels;
    private Gearbox gearbox;

    public Car() {
        this.engine = new CarEngine();
        this.wheels = new CarWheels();
        this.gearbox = Gearbox.builder().driveMode(DriveMode.PARK).build();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.startEngine();
        car.gearbox.enableDriveMode();
        validateMovingAction(car);

    }

}
