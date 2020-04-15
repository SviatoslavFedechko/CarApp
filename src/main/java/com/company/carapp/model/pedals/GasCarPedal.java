package com.company.carapp.model.pedals;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
@Getter
public class GasCarPedal implements Pressable {

    private boolean pressed;

    public void press() {
        pressed = true;
    }

    public void unpress() {
        if (!pressed) {
            log.info("Gas Pedal is already unpressed");
        }
        pressed = false;
    }

    public boolean isPressed() {
        return pressed;
    }
}
