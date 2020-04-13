package com.company.model;

import com.company.model.engine.Engine;
import com.company.model.gearbox.Gearbox;
import com.company.model.wheels.Wheels;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {

    private Engine engine;
    private Wheels wheels;
    private Gearbox gearbox;

}
