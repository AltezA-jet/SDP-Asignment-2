package com.example.pcfactory.products.ram;

public class ProfessionalRAM implements RAM {

    @Override
    public String getName() {
        return "Professional RAM 64GB";
    }

    @Override
    public int getCapacityGb() {
        return 64;
    }

    @Override
    public String getMemoryType() {
        return "DDR5";
    }

    @Override
    public int getFrequencyMhz() {
        return 5600;
    }

    @Override
    public int getPowerConsumption() {
        return 14;
    }
}