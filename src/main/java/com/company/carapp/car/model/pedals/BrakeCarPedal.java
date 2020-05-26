package com.company.carapp.car.model.pedals;

import lombok.Getter;

@Getter
public class BrakeCarPedal implements Pressable, Test {

    private boolean pressed;

    public void press() {
        pressed = true;
    }

    public void unpress() {
        pressed = false;
    }

    public static String test() {
        return "";
    }
}
