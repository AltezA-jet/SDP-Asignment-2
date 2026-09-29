package com.example.pcfactory.products.motherboard;

public class ExtremeMotherboard implements Motherboard {

    @Override
    public String getName() {
        return "Extreme X870 Motherboard";
    }

    @Override
    public String getCpuSocket() {
        return "AM5";
    }

    @Override
    public String getMemoryType() {
        return "DDR5";
    }

    @Override
    public int getMaxRamGb() {
        return 192;
    }

    @Override
    public int getMaxRamFrequencyMhz() {
        return 8000;
    }

    @Override
    public int getPowerConsumption() {
        return 100;
    }
}