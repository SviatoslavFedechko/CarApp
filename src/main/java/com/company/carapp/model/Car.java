package com.company.carapp.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Car {

    private Engine engine;
    private Wheels wheels;
    private Gearbox gearbox;
    private BrakePedal brakePedal;
    private GasPedal gasPedal;
    private IgnitionLock ignitionLock;

    public void insertKey() {
        ignitionLock.insertKey();
    }

    public void removeKey() {
        ignitionLock.removeKey();
    }

    public void turnKey() {
        ignitionLock.turnKey();
    }

    public void pressBrake() {
        if (gasPedal.isPressed()){
            throw new IllegalStateException("The gas pedal pressed. You can not press brake");
        }
        brakePedal.press();
    }

    public void releaseBrake() {
        brakePedal.unPress();
    }

    public void pressGas() {
        if (brakePedal.isPressed()){
            throw new IllegalStateException("The gas pedal pressed. You can not press brake");
        }
        gasPedal.press();
    }

    public void releaseGas() {
        gasPedal.unPress();
    }

    public void steerLeft() {
        wheels.steerLeft();
    }

    public void steerStraight() {
        wheels.steerStraight();
    }
    public void steerRight() {
        wheels.steerRight();
    }

    public void putCarInPark() {

    }

    public void putCarInDrive() {

    }

    public void putCarInReverse() {

    }




}
