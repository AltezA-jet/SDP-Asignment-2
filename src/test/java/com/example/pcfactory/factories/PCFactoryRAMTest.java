package com.example.pcfactory.factories;

import com.example.pcfactory.products.ram.BudgetRAM;
import com.example.pcfactory.products.ram.ExtremeRAM;
import com.example.pcfactory.products.ram.GamingRAM;
import com.example.pcfactory.products.ram.ProfessionalRAM;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PCFactoryRAMTest {

    @Test
    void budgetFactoryCreatesBudgetRAM() {
        PCFactory factory = new BudgetPCFactory();

        assertInstanceOf(BudgetRAM.class, factory.createRAM());
    }

    @Test
    void gamingFactoryCreatesGamingRAM() {
        PCFactory factory = new GamingPCFactory();

        assertInstanceOf(GamingRAM.class, factory.createRAM());
    }

    @Test
    void professionalFactoryCreatesProfessionalRAM() {
        PCFactory factory = new ProfessionalPCFactory();

        assertInstanceOf(ProfessionalRAM.class, factory.createRAM());
    }

    @Test
    void extremeFactoryCreatesExtremeRAM() {
        PCFactory factory = new ExtremePCFactory();

        assertInstanceOf(ExtremeRAM.class, factory.createRAM());
    }
}