package com.company.carapp.car.model.pedals;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
@Getter
public class GasCarPedal implements Pressable  {

    private static int some = 1;

    private boolean pressed;

    public static String test () {
        return "";
    }

    public void press() {
        pressed = true;
    }

    public void unpress() {
        if (!pressed) {
            log.info("Gas Pedal is already unpressed");
        }
        pressed = false;
    }


}
