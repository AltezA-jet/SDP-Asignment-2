package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.ram.RAM;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.motherboard.Motherboard;
import com.example.pcfactory.products.pc_case.PCCase;
import com.example.pcfactory.products.powersupply.PowerSupply;

public interface PCFactory {

    CPU createCPU();

    GPU createGPU();

    RAM createRAM();

    Cooling createCooling();

    Motherboard createMotherboard();

    PCCase createCase();

    PowerSupply createPowerSupply();
}