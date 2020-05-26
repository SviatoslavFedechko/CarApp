package com.company.carapp.car.states;

import com.company.carapp.car.model.Car;

public class CarIsTurningLeftState implements CarState {

    public void insertKey(Car car) {

    }

    public void removeKey(Car car) {

    }

    public void turnKey(Car car) {

    }

    public void pressBrake(Car car) {

    }

    public void releaseBrake(Car car) {

    }

    public void pressGas(Car car) {
        car.getGasPedal().press();
        car.setState(new CarIsMovingForwardState());
    }

    public void releaseGas(Car car) {

    }

    public void steerLeft(Car car) {

    }

    public void steerStraight(Car car) {
        car.getWheels().steerStraight();
    }

    public void steerRight(Car car) {

    }

    public void putCarInPark(Car car) {

    }

    public void putCarInDrive(Car car) {

    }

    public void putCarInReverse(Car car) {

    }

    public void printStatus() {
        System.out.println("The car is turning left");
    }
}
