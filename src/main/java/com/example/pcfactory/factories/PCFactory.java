package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.Cooling;

public interface PCFactory {

    CPU createCPU();

    GPU createGPU();

    Cooling createCooling();
}