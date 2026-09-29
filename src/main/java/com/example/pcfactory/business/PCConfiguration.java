package com.example.pcfactory.business;

import com.example.pcfactory.factories.PCFactory;
import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.ram.RAM;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.motherboard.Motherboard;
import com.example.pcfactory.products.pc_case.PCCase;
import com.example.pcfactory.products.powersupply.PowerSupply;

public class PCConfiguration {

    private final CPU cpu;
    private final GPU gpu;
    private final RAM ram;
    private final Cooling cooling;
    private final Motherboard motherboard;
    private final PCCase pcCase;
    private final PowerSupply powerSupply;

    public PCConfiguration(PCFactory factory) {
        this.cpu = factory.createCPU();
        this.gpu = factory.createGPU();
        this.ram = factory.createRAM();
        this.cooling = factory.createCooling();
        this.motherboard = factory.createMotherboard();
        this.pcCase = factory.createCase();
        this.powerSupply = factory.createPowerSupply();
    }

    public int calculateTotalPower() {
        return cpu.getPowerConsumption()
                + gpu.getPowerConsumption()
                + ram.getPowerConsumption()
                + cooling.getPowerConsumption()
                + motherboard.getPowerConsumption()
                + powerSupply.getPowerConsumption();
    }

    public int calculatePerformanceScore() {
        return (cpu.getPerformance()
                + gpu.getPerformance()
                + cooling.getCoolingPerformance()) / 3;
    }

    public boolean isBalanced() {
        return cooling.getCoolingPerformance() >= cpu.getPerformance();
    }

    public boolean isCompatible() {
        CompatibilityChecker checker = new CompatibilityChecker();

        return checker.isCompatible(
                cpu,
                gpu,
                ram,
                cooling,
                motherboard,
                pcCase,
                powerSupply
        );
    }

    public void printSummary() {
        System.out.println("CPU: " + cpu.getName());
        System.out.println("GPU: " + gpu.getName());
        System.out.println("RAM: " + ram.getName());
        System.out.println("Motherboard: " + motherboard.getName());
        System.out.println("Cooling: " + cooling.getName());
        System.out.println("Case: " + pcCase.getName());
        System.out.println("Power Supply: " + powerSupply.getName());
        System.out.println("Total power: " + calculateTotalPower() + " W");
        System.out.println("Performance score: " + calculatePerformanceScore());
        System.out.println("Balanced cooling: " + isBalanced());
        System.out.println("Compatible: " + isCompatible());
        
    }


}