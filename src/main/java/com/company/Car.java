package com.company;

import com.company.model.engine.Engine;
import com.company.model.gearbox.Gearbox;
import com.company.model.wheels.Wheels;
import lombok.Data;

@Data
public class Car {

    private Engine engine;
    private Wheels wheels;
    private Gearbox gearbox;

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.startEngine();

    }

}
