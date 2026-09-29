package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.BudgetCPU;
import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.BudgetGPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.BudgetCooling;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.ram.BudgetRAM;
import com.example.pcfactory.products.ram.RAM;

public class BudgetPCFactory implements PCFactory {

    @Override
    public CPU createCPU() {
        return new BudgetCPU();
    }

    @Override
    public GPU createGPU() {
        return new BudgetGPU();
    }

    @Override
    public Cooling createCooling() {
        return new BudgetCooling();
    }

    @Override 
    public RAM createRAM(){
        return new BudgetRAM();
    }

}