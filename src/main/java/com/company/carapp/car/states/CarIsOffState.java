package com.company.carapp.car.states;

import com.company.carapp.car.model.Car;

public class CarIsOffState implements CarState {

    public void insertKey(Car car) {
        car.getIgnitionLock().insertKey();
    }

    public void removeKey(Car car) {

    }

    public void turnKey(Car car) {
        car.getIgnitionLock().turnKey();
        car.setState(new EngineRunningState());
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

    }

    public void putCarInDrive(Car car) {

    }

    public void putCarInReverse(Car car) {

    }

    public void printStatus() {
        System.out.println("The car is off");
    }
}
