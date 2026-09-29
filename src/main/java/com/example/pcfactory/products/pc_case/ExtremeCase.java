package com.example.pcfactory.products.pc_case;

public class ExtremeCase implements PCCase {

    @Override
    public String getName() {
        return "Extreme Full Tower Case";
    }

    @Override
    public int getMaxGpuLengthMm() {
        return 450;
    }

    @Override
    public int getMaxCoolingHeightMm() {
        return 200;
    }

    @Override
    public int getPowerConsumption() {
        return 0;
    }
}