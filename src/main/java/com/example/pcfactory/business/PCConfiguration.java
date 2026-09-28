package com.example.pcfactory.business;

import com.example.pcfactory.factories.PCFactory;
import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.Cooling;

public class PCConfiguration {

    private final CPU cpu;
    private final GPU gpu;
    private final Cooling cooling;

    public PCConfiguration(PCFactory factory) {
        this.cpu = factory.createCPU();
        this.gpu = factory.createGPU();
        this.cooling = factory.createCooling();
    }

    public int calculateTotalPower() {
        return cpu.getPowerConsumption()
                + gpu.getPowerConsumption()
                + cooling.getPowerConsumption();
    }

    public int calculatePerformanceScore() {
        return (cpu.getPerformance()
                + gpu.getPerformance()
                + cooling.getCoolingPerformance()) / 3;
    }

    public boolean isBalanced() {
        return cooling.getCoolingPerformance() >= cpu.getPerformance();
    }

    public void printSummary() {
        System.out.println("CPU: " + cpu.getName());
        System.out.println("GPU: " + gpu.getName());
        System.out.println("Cooling: " + cooling.getName());
        System.out.println("Total power: " + calculateTotalPower() + " W");
        System.out.println("Performance score: " + calculatePerformanceScore());
        System.out.println("Balanced cooling: " + isBalanced());
    }
}