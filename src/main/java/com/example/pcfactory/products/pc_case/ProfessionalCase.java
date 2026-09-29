package com.example.pcfactory.products.pc_case;

public class ProfessionalCase implements PCCase {

    @Override
    public String getName() {
        return "Professional PC Case";
    }

    @Override
    public int getMaxGpuLengthMm() {
        return 400;
    }

    @Override
    public int getMaxCoolingHeightMm() {
        return 185;
    }

    @Override
    public int getPowerConsumption() {
        return 0;
    }
}