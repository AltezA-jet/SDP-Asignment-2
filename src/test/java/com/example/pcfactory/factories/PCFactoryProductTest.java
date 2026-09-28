package com.example.pcfactory.factories;

import com.example.pcfactory.products.cpu.BudgetCPU;
import com.example.pcfactory.products.gpu.GamingGPU;
import com.example.pcfactory.products.cooling.ProfessionalCooling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PCFactoryProductTest {

    @Test
    void budgetFactoryCreatesBudgetCPU() {
        PCFactory factory = new BudgetPCFactory();

        assertInstanceOf(BudgetCPU.class, factory.createCPU());
    }

    @Test
    void gamingFactoryCreatesGamingGPU() {
        PCFactory factory = new GamingPCFactory();

        assertInstanceOf(GamingGPU.class, factory.createGPU());
    }

    @Test
    void professionalFactoryCreatesProfessionalCooling() {
        PCFactory factory = new ProfessionalPCFactory();

        assertInstanceOf(ProfessionalCooling.class, factory.createCooling());
    }

    @Test
    void gamingFactoryCreatesAllProducts() {
        PCFactory factory = new GamingPCFactory();

        assertInstanceOf(
                com.example.pcfactory.products.cpu.GamingCPU.class,
                factory.createCPU()
        );

        assertInstanceOf(
                com.example.pcfactory.products.gpu.GamingGPU.class,
                factory.createGPU()
        );

        assertInstanceOf(
                com.example.pcfactory.products.cooling.GamingCooling.class,
                factory.createCooling()
        );
    }
}