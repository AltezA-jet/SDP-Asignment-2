package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.GamingCPU;
import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GamingGPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.GamingCooling;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.ram.GamingRAM;
import com.example.pcfactory.products.ram.RAM;

public class GamingPCFactory implements PCFactory {

    @Override
    public CPU createCPU() {
        return new GamingCPU();
    }

    @Override
    public GPU createGPU() {
        return new GamingGPU();
    }

    @Override
    public Cooling createCooling() {
        return new GamingCooling();
    }

    @Override
    public RAM createRAM() {
        return new GamingRAM();
    }


}