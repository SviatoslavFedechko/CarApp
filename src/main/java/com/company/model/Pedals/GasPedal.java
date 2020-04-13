package com.company.model.Pedals;

import com.company.service.LogService;
import com.company.service.LogServiceConsoleImpl;
import lombok.Data;

@Data
public class GasPedal extends Pedal {

    private LogService logService;

    public GasPedal() {
        this.logService = new LogServiceConsoleImpl();
    }

}
