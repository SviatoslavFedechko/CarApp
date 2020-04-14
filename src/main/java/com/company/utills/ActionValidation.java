package com.company.utills;

import com.company.Car;

public class ActionValidation {

    public static void validateMovingAction(Car car) {
        if (car.getWheels().isBrakePedalPressed()) {
            throw new IllegalStateException("You can not move with brake pedal pressed");
        }
    }

}
