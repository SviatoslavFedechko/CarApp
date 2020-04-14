package com.company.carapp.model;

import lombok.Getter;

@Getter
public class GasPedal extends Pedal {

    private boolean pressed;

    public GasPedal(Gearbox gearbox, Engine engine) {
        super(gearbox, engine);
    }

    public void press() {
        this.pressed = true;
    }

    public void unPress() {
        this.pressed = false;
    }

    public boolean check() {
        return pressed;
    }
}
