package com.example.pcfactory.client;


import com.example.pcfactory.products.cpu.BudgetCPU;
import com.example.pcfactory.products.cpu.GamingCPU;
import com.example.pcfactory.products.gpu.GamingGPU;
import com.example.pcfactory.products.gpu.BudgetGPU;


public class PCClient {

    public void buildBudgetPC() {
        BudgetCPU cpu = new BudgetCPU();
        BudgetGPU gpu = new BudgetGPU();

        System.out.println("Building Budget PC");
        System.out.println(cpu.getName());
        System.out.println(gpu.getName());
    }

    public void buildGamingPC() {
        GamingCPU cpu = new GamingCPU();
        GamingGPU gpu = new GamingGPU();

        System.out.println("Building Gaming PC");
        System.out.println(cpu.getName());
        System.out.println(gpu.getName());
    }
}