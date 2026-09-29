package com.example.pcfactory.products.ram;

public class ExtremeRAM implements RAM {

    @Override
    public String getName() {
        return "Extreme RAM 128GB";
    }

    @Override
    public int getCapacityGb() {
        return 128;
    }

    @Override
    public String getMemoryType() {
        return "DDR5";
    }

    @Override
    public int getFrequencyMhz() {
        return 6400;
    }

    @Override
    public int getPowerConsumption() {
        return 20;
    }
}