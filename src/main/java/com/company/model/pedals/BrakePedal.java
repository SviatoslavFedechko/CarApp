package com.company.model.pedals;

import static com.company.utills.msgConstants.CAR_IS_STOPPED;

import com.company.service.LogService;
import com.company.service.LogServiceConsoleImpl;
import lombok.Data;

@Data
public class BrakePedal extends Pedal {
    private LogService logService;

    public BrakePedal() {
        this.logService = new LogServiceConsoleImpl();
    }


    public void logAction() {
        logService.logInfo(CAR_IS_STOPPED);
    }
}
