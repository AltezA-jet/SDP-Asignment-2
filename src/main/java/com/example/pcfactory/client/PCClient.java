package com.example.pcfactory.client;

import com.example.pcfactory.factories.PCFactory;
import com.example.pcfactory.products.cpu.CPU;
import com.example.pcfactory.products.gpu.GPU;
import com.example.pcfactory.products.cooling.Cooling;

public class PCClient {

    public void buildPC(PCFactory factory) {

        CPU cpu = factory.createCPU();
        GPU gpu = factory.createGPU();
        Cooling cooling = factory.createCooling();

        System.out.println("Building PC");
        System.out.println("CPU: " + cpu.getName());
        System.out.println("GPU: " + gpu.getName());
        System.out.println("Cooling: " + cooling.getName());
    }
}