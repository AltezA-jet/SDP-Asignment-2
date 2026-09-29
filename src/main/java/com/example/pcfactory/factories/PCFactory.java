package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.ram.RAM;

public interface PCFactory {

    CPU createCPU();

    GPU createGPU();

    Cooling createCooling();

    RAM createRAM();
}