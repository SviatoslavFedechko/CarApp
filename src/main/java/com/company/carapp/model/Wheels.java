package com.company.carapp.model;

public class Wheels {

    private State state;
    private IgnitionLock ignitionLock;

    public Wheels(IgnitionLock ignitionLock) {
        this.state = State.STEER_STRAIGHT;
        this.ignitionLock = ignitionLock;
    }

    public void steerLeft() {
        if (IgnitionLock.State.ON != ignitionLock.getState()){
            throw new IllegalStateException("The key is already inserted");
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
