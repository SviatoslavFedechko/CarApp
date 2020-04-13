package com.company.service;

import com.company.model.engine.Engine;

public interface EngineService {

    void startEngine(Engine engine);

    void stopEngine(Engine engine);

    void startMovingForward(Engine engine);

    void stoptMoving(Engine engine);

}
