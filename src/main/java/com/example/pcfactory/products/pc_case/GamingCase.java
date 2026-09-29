package com.example.pcfactory.products.pc_case;

public class GamingCase implements PCCase {

    @Override
    public String getName() {
        return "Gaming PC Case";
    }

    @Override
    public int getMaxGpuLengthMm() {
        return 360;
    }

    @Override
    public int getMaxCoolingHeightMm() {
        return 170;
    }

    @Override
    public int getPowerConsumption() {
        return 0;
    }
}