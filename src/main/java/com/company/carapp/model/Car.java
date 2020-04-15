package com.company.carapp.model;

import com.company.carapp.model.pedals.Pressable;
import com.company.carapp.states.CarState;
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
