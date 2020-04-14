package com.company.model.wheels;

import com.company.model.pedals.BrakePedal;
import com.company.model.pedals.Pedal;

public class CarWheels extends Wheels {

    private SteerPosition steerPosition;
    private Pedal brakePedal;

    public CarWheels() {
        this.steerPosition = SteerPosition.STEER_STRAIGHT;
        this.brakePedal = new BrakePedal();
    }

    public boolean isBrakePedalPressed() {
        return brakePedal.isPressed();
    }
}
