package com.company;

import com.company.service.EngineService;
import com.company.service.EngineServiceImpl;
import com.company.service.GearboxService;
import com.company.service.GearboxServiceImpl;
import com.company.service.LogService;
import com.company.service.LogServiceConsoleImpl;
import com.company.service.PedalService;
import com.company.service.PedalServiceImpl;
import com.company.service.WheelsService;
import com.company.service.WheelsServiceImpl;

public class CarDrive {

    public EngineService engineService;
    public GearboxService gearboxService;
    public LogService logService;
    public PedalService pedalService;
    public WheelsService wheelsService;

    public CarDrive() {
        this.engineService = new EngineServiceImpl();
        this.gearboxService = new GearboxServiceImpl();
        this.logService = new LogServiceConsoleImpl();
        this.pedalService = new PedalServiceImpl();
        this.wheelsService = new WheelsServiceImpl();
    }

    public static void main(String[] args) {
        Car car = Car.builder().build();

    }

}
