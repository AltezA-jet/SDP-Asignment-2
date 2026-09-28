package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.cpu.ExtremeCPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.gpu.ExtremeGPU;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.cooling.ExtremeCooling;

public class ExtremePCFactory implements PCFactory {

    @Override
    public CPU createCPU() {
        return new ExtremeCPU();
    }

    @Override
    public GPU createGPU() {
        return new ExtremeGPU();
    }

    @Override
    public Cooling createCooling() {
        return new ExtremeCooling();
    }
}