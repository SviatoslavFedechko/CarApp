package com.company.carapp.states;

import com.company.carapp.model.Car;

public interface CarState {

    void insertKey(Car car);
    void removeKey(Car car);
    void turnKey(Car car);

    void pressBrake(Car car);
    void releaseBrake(Car car);

    void pressGas(Car car);
    void releaseGas(Car car);

    void steerLeft(Car car);
    void steerStraight(Car car);
    void steerRight(Car car);

    void putCarInPark(Car car);
    void putCarInDrive(Car car);
    void putCarInReverse(Car car);

    void printStatus();

}
