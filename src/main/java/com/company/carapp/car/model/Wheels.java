package com.company.carapp.car.model;

public class Wheels {

    private State state;
    private final IgnitionLock ignitionLock;

    public Wheels(IgnitionLock ignitionLock) {
        state = State.STEER_STRAIGHT;
        this.ignitionLock = ignitionLock;
    }

    public void steerLeft() {
        if (IgnitionLock.State.ON != ignitionLock.getState()){
            throw new IllegalStateException("Ignition lock is not On");
        }
        state = State.STEER_LEFT;
    }

    public void steerStraight() {
        state = State.STEER_STRAIGHT;
    }
    public void steerRight() {
        state = State.STEER_RIGHT;
    }

    public enum State {
        STEER_LEFT,
        STEER_STRAIGHT,
        STEER_RIGHT
    }
}
