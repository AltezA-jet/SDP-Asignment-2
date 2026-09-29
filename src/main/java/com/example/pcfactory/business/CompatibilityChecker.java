package com.example.pcfactory.business;

import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.ram.RAM;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.motherboard.Motherboard;
import com.example.pcfactory.products.pc_case.PCCase;
import com.example.pcfactory.products.powersupply.PowerSupply;

public class CompatibilityChecker {

    public boolean isCompatible(
            CPU cpu,
            GPU gpu,
            RAM ram,
            Cooling cooling,
            Motherboard motherboard,
            PCCase pcCase,
            PowerSupply powerSupply) {

        boolean cpuCompatible =
                cpu.getSocket().equals(motherboard.getCpuSocket());

        boolean ramTypeCompatible =
                ram.getMemoryType().equals(motherboard.getMemoryType());

        boolean ramCapacityCompatible =
                ram.getCapacityGb() <= motherboard.getMaxRamGb();

        boolean ramFrequencyCompatible =
                ram.getFrequencyMhz() <= motherboard.getMaxRamFrequencyMhz();

        int totalPower =
                cpu.getPowerConsumption()
                + gpu.getPowerConsumption()
                + ram.getPowerConsumption()
                + cooling.getPowerConsumption()
                + motherboard.getPowerConsumption()
                + powerSupply.getPowerConsumption();

        boolean powerCompatible =
                totalPower <= powerSupply.getWattage();
        
        boolean gpuCaseCompatible =
                gpu.getLengthMm() <= pcCase.getMaxGpuLengthMm();

        boolean coolingCompatible =
            cpu.getPerformance() <= cooling.getMaxCpuPerformance();

        return cpuCompatible
                && ramTypeCompatible
                && ramCapacityCompatible
                && ramFrequencyCompatible
                && powerCompatible
                && gpuCaseCompatible
                && coolingCompatible;
        
        
    }
}