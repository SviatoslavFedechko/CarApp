package com.company.carapp.car;

import com.company.carapp.car.model.Car;
import com.company.carapp.car.model.Engine;
import com.company.carapp.car.model.Gearbox;
import com.company.carapp.car.model.IgnitionLock;
import com.company.carapp.car.model.Wheels;
import com.company.carapp.car.model.pedals.BrakeCarPedal;
import com.company.carapp.car.model.pedals.GasCarPedal;
import com.company.carapp.car.states.CarIsOffState;

public class MainApp {

    public static void main(String[] args) {
        Car car = getCar();
        car.getGasPedal().isPressed();
        car.getBrakePedal().isPressed();


        System.out.println(car.hashCode());

        car.getState().printStatus();

        car.getState().insertKey(car);
        car.getState().turnKey(car);
        car.getState().printStatus();

        car.getState().putCarInDrive(car);
        car.getState().pressGas(car);
        car.getState().printStatus();

        car.getState().steerLeft(car);
        car.getState().printStatus();

        car.getState().steerStraight(car);
        car.getState().pressGas(car);
        car.getState().printStatus();

        car.getState().putCarInPark(car);

        car.getState().releaseGas(car);
        car.getState().pressBrake(car);
        car.getState().printStatus();

        car.getState().putCarInPark(car);
        car.getState().printStatus();
    }

    private static Car getCar() {
        Engine engine = new Engine();
        IgnitionLock ignitionLock = new IgnitionLock(engine);
        Wheels wheels = new Wheels(ignitionLock);
        Gearbox gearbox = new Gearbox(engine);
        return Car.builder()
            .state(new CarIsOffState())
            .engine(engine)
            .wheels(wheels)
            .gearbox(gearbox)
            .brakePedal(new BrakeCarPedal())
            .gasPedal(new GasCarPedal())
            .ignitionLock(ignitionLock)
            .build();
    }

}
