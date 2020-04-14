package com.company.model.engine;

import com.company.model.pedals.GasPedal;

public class Engine {

    private boolean engineOn;
    private Key key;
    private GasPedal gasPedal;

    public void startEngine() {
        key.InsertKey();
        key.TurnKey();
    }

}
