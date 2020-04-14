package com.company.carapp.model;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
@Getter
public class Engine {

    private boolean on;

    public void start() {
        this.on = true;
        log.info("The engine is running");
    }

    public void stop() {
        this.on = false;
        log.info("The car is off");
    }

    public boolean check() {
        return this.on;
    }
}
