package com.company.model.Pedals;

import static com.company.utils.msgConstants.CAR_MOVING_FORWARD;

import com.company.service.LogService;
import com.company.service.LogServiceConsoleImpl;
import lombok.Data;

@Data
public class GasPedal extends Pedal {

    private LogService logService;

    public GasPedal() {
        this.logService = new LogServiceConsoleImpl();
    }


    public void logAction() {
        logService.logInfo(CAR_MOVING_FORWARD);
    }
}
