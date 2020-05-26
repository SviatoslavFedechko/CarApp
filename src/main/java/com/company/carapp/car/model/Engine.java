package com.company.carapp.car.model;

import lombok.Getter;

@Getter
public class Engine {

    private boolean on;

    public void start() {
        on = true;
    }

    public void stop() {
        on = false;
    }

}
