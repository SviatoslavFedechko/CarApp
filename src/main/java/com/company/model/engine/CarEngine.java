package com.company.model.engine;

import com.company.model.key.Key;
import com.company.model.key.ManualKey;
import com.company.model.pedals.GasPedal;

public class CarEngine extends Engine{

    private boolean on;
    private Key key;
    private GasPedal gasPedal;

    public CarEngine () {
        this.key = new ManualKey();
    }

    public void startEngine() {
        key.startEngine();
    }

}
