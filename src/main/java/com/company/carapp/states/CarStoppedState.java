package com.company.carapp.states;

import com.company.carapp.model.Car;

public class CarStoppedState implements CarState {

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

    }

    public void releaseGas(Car car) {

    }

    public void steerLeft(Car car) {

    }

    public void steerStraight(Car car) {

    }

    public void steerRight(Car car) {

    }

    public void putCarInPark(Car car) {
        car.getGearbox().enableParkMode();
        car.setState(new CarParkedState());
    }

    public void putCarInDrive(Car car) {

    }

    public void putCarInReverse(Car car) {

    }

    public void printStatus() {
        System.out.println("Car is stopped");
    }
}
