package com.company.carapp.car.model;

import com.company.carapp.car.model.pedals.Pressable;
import com.company.carapp.car.states.CarState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {

    private CarState state;
    private Engine engine;
    private Wheels wheels;
    private Gearbox gearbox;
    private Pressable brakePedal;
    private Pressable gasPedal;
    private IgnitionLock ignitionLock;

}
