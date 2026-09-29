package com.example.pcfactory.products.motherboard;

public interface Motherboard {

    String getName();

    String getCpuSocket();

    String getMemoryType();

    int getMaxRamGb();

    int getMaxRamFrequencyMhz();

    int getPowerConsumption();
}