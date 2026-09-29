package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.ProfessionalCPU;
import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.ProfessionalGPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.ProfessionalCooling;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.ram.ProfessionalRAM;
import com.example.pcfactory.products.ram.RAM;

public class ProfessionalPCFactory implements PCFactory {

    @Override
    public CPU createCPU() {
        return new ProfessionalCPU();
    }

    @Override
    public GPU createGPU() {
        return new ProfessionalGPU();
    }

    @Override
    public Cooling createCooling() {
        return new ProfessionalCooling();
    }

    @Override
    public RAM createRAM() {
        return new ProfessionalRAM();
    }
}