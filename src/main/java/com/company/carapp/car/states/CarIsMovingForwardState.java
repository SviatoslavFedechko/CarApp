package com.company.carapp.car.states;

import com.company.carapp.car.model.Car;

public class CarIsMovingForwardState implements CarState {

    public void insertKey(Car car) {

    }

    public void removeKey(Car car) {

    }

    public void turnKey(Car car) {

    }

    public void pressBrake(Car car) {
        car.getBrakePedal().press();
        car.setState(new CarStoppedState());
    }

    public void releaseBrake(Car car) {

    }

    public void pressGas(Car car) {

    }

    public void releaseGas(Car car) {
        car.getGasPedal().unpress();
    }

    public void steerLeft(Car car) {
        car.getWheels().steerLeft();
        car.setState(new CarIsTurningLeftState());
    }

    public void steerStraight(Car car) {

    }

    public void steerRight(Car car) {

    }

    public void putCarInPark(Car car) {
        System.out.println("Error: You just tried to put the car in park while it was moving forward!");
    }

    public void putCarInDrive(Car car) {

    }

    public void putCarInReverse(Car car) {

    }

    public void printStatus() {
        System.out.println("The car is moving forward");
    }
}
