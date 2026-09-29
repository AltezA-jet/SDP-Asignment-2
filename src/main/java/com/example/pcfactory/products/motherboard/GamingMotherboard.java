package com.example.pcfactory.products.motherboard;

public class GamingMotherboard implements Motherboard {

    @Override
    public String getName() {
        return "Gaming B650 Motherboard";
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
        return 64;
    }

    @Override
    public int getMaxRamFrequencyMhz() {
        return 6400;
    }

    @Override
    public int getPowerConsumption() {
        return 70;
    }
}