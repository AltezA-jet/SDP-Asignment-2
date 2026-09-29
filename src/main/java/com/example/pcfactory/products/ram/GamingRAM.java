package com.example.pcfactory.products.ram;

public class GamingRAM implements RAM {

    @Override
    public String getName() {
        return "Gaming RAM 32GB";
    }

    @Override
    public int getCapacityGb() {
        return 32;
    }

    @Override
    public String getMemoryType() {
        return "DDR5";
    }

    @Override
    public int getFrequencyMhz() {
        return 6000;
    }

    @Override
    public int getPowerConsumption() {
        return 10;
    }
}