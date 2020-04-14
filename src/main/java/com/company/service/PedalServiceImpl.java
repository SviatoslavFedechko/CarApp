package com.company.service;

import com.company.model.pedals.Pedal;

public class PedalServiceImpl implements PedalService {

    public void pressPedal(Pedal pedal) {
        pedal.setPressed(true);
        pedal.logAction();
    }

    public void releasePedal(Pedal pedal) {

    }

}
