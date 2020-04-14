package com.company.service;

import com.company.model.pedals.Pedal;

public interface PedalService {

    void pressPedal(Pedal pedal);

    void releasePedal(Pedal pedal);

}
