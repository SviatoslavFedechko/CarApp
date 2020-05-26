package com.company.carapp.car.model.pedals;

public interface Test {

    public static int t = 0;

    default boolean isPressed() {
        return false;
    }

}
