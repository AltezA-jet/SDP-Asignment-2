package com.example.pcfactory.business;

import com.example.pcfactory.factories.BudgetPCFactory;
import com.example.pcfactory.factories.GamingPCFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PCConfigurationBusinessTest {

    @Test
    void shouldCalculateGamingPower() {
        PCConfiguration configuration =
                new PCConfiguration(new GamingPCFactory());

        assertEquals(445, configuration.calculateTotalPower());
    }

    @Test
    void shouldCalculateGamingPerformance() {
        PCConfiguration configuration =
                new PCConfiguration(new GamingPCFactory());

        assertEquals(90, configuration.calculatePerformanceScore());
    }

    @Test
    void gamingConfigurationShouldHaveBalancedCooling() {
        PCConfiguration configuration =
                new PCConfiguration(new GamingPCFactory());

        assertTrue(configuration.isBalanced());
    }

    @Test
    void shouldCalculateBudgetPower() {
        PCConfiguration configuration =
                new PCConfiguration(new BudgetPCFactory());

        assertEquals(203, configuration.calculateTotalPower());
    }
}
