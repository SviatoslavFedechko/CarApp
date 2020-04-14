package com.company.carapp.model;

import lombok.Getter;

@Getter
public class BrakePedal extends Pedal {

    private boolean pressed;

    public BrakePedal(Gearbox gearbox, Engine engine) {
        super(gearbox, engine);
    }

    public void press() {
        this.pressed = true;
    }

    public void unPress() {
        this.pressed = false;
    }
}
