package com.example.pcfactory.products.motherboard;

public class ProfessionalMotherboard implements Motherboard {

    @Override
    public String getName() {
        return "Professional X670 Motherboard";
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
        return 128;
    }

    @Override
    public int getMaxRamFrequencyMhz() {
        return 6000;
    }

    @Override
    public int getPowerConsumption() {
        return 90;
    }
}