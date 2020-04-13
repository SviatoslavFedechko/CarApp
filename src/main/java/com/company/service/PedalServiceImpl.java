package com.company.service;

import com.company.model.Pedals.Pedal;

public class PedalServiceImpl implements PedalService {

    public void pressPedal(Pedal pedal) {
        pedal.setPedalPressed(true);
        pedal.logAction();
    }

    public void releasePedal(Pedal pedal) {

    }

}
