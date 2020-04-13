package com.company.model.Pedals;

import lombok.Data;

@Data
public abstract class Pedal {

    private boolean pedalPressed;

    public abstract void logAction();
}
