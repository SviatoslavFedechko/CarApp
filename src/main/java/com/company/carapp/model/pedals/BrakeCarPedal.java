package com.company.carapp.model.pedals;

import lombok.Getter;

@Getter
public class BrakeCarPedal implements Pressable {

    private boolean pressed;

    public void press() {
        pressed = true;
    }

    public void unpress() {
        pressed = false;
    }

    public boolean isPressed() {
        return pressed;
    }
}
