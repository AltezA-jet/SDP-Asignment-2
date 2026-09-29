package com.example.pcfactory.products.pc_case;

public class BudgetCase implements PCCase {

    @Override
    public String getName() {
        return "Budget PC Case";
    }

    @Override
    public int getMaxGpuLengthMm() {
        return 300;
    }

    @Override
    public int getMaxCoolingHeightMm() {
        return 150;
    }

    @Override
    public int getPowerConsumption() {
        return 0;
    }
}