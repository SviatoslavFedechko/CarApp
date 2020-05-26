package com.company.carapp.car.model;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
@Getter
public class IgnitionLock {

    private State state;
    private final Engine engine;

    public IgnitionLock(Engine engine) {
        state = State.EMPTY;
        this.engine = engine;
    }

    public void startEngine() {
        insertKey();
        turnKey();
    }

    public void insertKey() {
        if (State.EMPTY == state) {
            state = State.OFF;
        } else {
            log.severe("The key is already inserted");
            throw new IllegalStateException("The key is already inserted");
        }
    }

    public void removeKey() {
        switch (state) {
            case OFF:
                state = State.EMPTY;
                break;
            case ON:
                throw new IllegalStateException("You cannot remove key - Engine is started");
            case EMPTY:
                throw new IllegalStateException("The key is not inserted");
        }
    }

    public void turnKey() {
        switch (state) {
            case OFF:
                state = State.ON;
                engine.start();
                break;
            case ON:
                state = State.OFF;
                engine.stop();
                break;
            case EMPTY:
                throw new IllegalStateException("The key is not inserted");
        }
    }

    public enum State {
        ON,
        OFF,
        EMPTY
    }

}
