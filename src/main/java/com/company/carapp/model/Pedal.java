package com.company.carapp.model;

import lombok.Getter;

@Getter
public abstract class Pedal {

    private Gearbox gearbox;
    private Engine engine;

    public Pedal(Gearbox gearbox, Engine engine) {
        this.gearbox = gearbox;
        this.engine = engine;
    }

    public abstract void press();
    
    public abstract void unPress();

}
