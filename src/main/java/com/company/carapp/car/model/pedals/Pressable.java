package com.company.carapp.car.model.pedals;

public interface Pressable {

    int speed = 1;

    void press();
    
    void unpress();

    default boolean isPressed() {
        return true;
    }

}
