package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.BudgetCPU;
import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.BudgetGPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.BudgetCooling;
import com.example.pcfactory.products.cooling.Cooling;
import com.example.pcfactory.products.ram.BudgetRAM;
import com.example.pcfactory.products.ram.RAM;
import com.example.pcfactory.products.motherboard.BudgetMotherboard;
import com.example.pcfactory.products.motherboard.Motherboard;
import com.example.pcfactory.products.pc_case.BudgetCase;
import com.example.pcfactory.products.pc_case.PCCase;
import com.example.pcfactory.products.powersupply.BudgetPowerSupply;
import com.example.pcfactory.products.powersupply.PowerSupply;

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

    @Override
    public Motherboard createMotherboard() {
        return new BudgetMotherboard();
    }

    @Override
    public PCCase createCase() {
        return new BudgetCase();
    }

    @Override
    public PowerSupply createPowerSupply() {
        return new BudgetPowerSupply();
    }

}