package com.example.pcfactory.business;

import com.example.pcfactory.factories.BudgetPCFactory;
import com.example.pcfactory.factories.GamingPCFactory;
import com.example.pcfactory.factories.ProfessionalPCFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PCConfigurationCompatibilityTest {

    @Test
    void budgetConfigurationShouldBeBalanced() {
        PCConfiguration configuration =
                new PCConfiguration(new BudgetPCFactory());

        assertTrue(configuration.isBalanced());
    }

    @Test
    void gamingConfigurationShouldBeBalanced() {
        PCConfiguration configuration =
                new PCConfiguration(new GamingPCFactory());

        assertTrue(configuration.isBalanced());
    }

    @Test
    void professionalConfigurationShouldBeBalanced() {
        PCConfiguration configuration =
                new PCConfiguration(new ProfessionalPCFactory());

        assertTrue(configuration.isBalanced());
    }
}