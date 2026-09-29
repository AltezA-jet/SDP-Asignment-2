package com.example.pcfactory.products.motherboard;

public class BudgetMotherboard implements Motherboard {

    @Override
    public String getName() {
        return "Budget B550 Motherboard";
    }

    @Override
    public String getCpuSocket() {
        return "AM4";
    }

    @Override
    public String getMemoryType() {
        return "DDR4";
    }

    @Override
    public int getMaxRamGb() {
        return 32;
    }

    @Override
    public int getMaxRamFrequencyMhz() {
        return 3600;
    }

    @Override
    public int getPowerConsumption() {
        return 50;
    }
}