package com.example.pcfactory.business;

import com.example.pcfactory.products.cpu.BudgetCPU;
import com.example.pcfactory.products.cpu.GamingCPU;
import com.example.pcfactory.products.gpu.BudgetGPU;
import com.example.pcfactory.products.ram.BudgetRAM;
import com.example.pcfactory.products.ram.GamingRAM;
import com.example.pcfactory.products.cooling.BudgetCooling;
import com.example.pcfactory.products.motherboard.BudgetMotherboard;
import com.example.pcfactory.products.motherboard.GamingMotherboard;
import com.example.pcfactory.products.pc_case.BudgetCase;
import com.example.pcfactory.products.powersupply.BudgetPowerSupply;
import com.example.pcfactory.products.powersupply.GamingPowerSupply;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompatibilityCheckerTest {

    @Test
    void compatibleBudgetComponentsShouldPass() {
        CompatibilityChecker checker = new CompatibilityChecker();

        boolean result = checker.isCompatible(
                new BudgetCPU(),
                new BudgetGPU(),
                new BudgetRAM(),
                new BudgetCooling(),
                new BudgetMotherboard(),
                new BudgetCase(),
                new BudgetPowerSupply()
        );

        assertTrue(result);
    }

    @Test
    void incompatibleCpuAndMotherboardShouldFail() {
        CompatibilityChecker checker = new CompatibilityChecker();

        boolean result = checker.isCompatible(
                new GamingCPU(),
                new BudgetGPU(),
                new BudgetRAM(),
                new BudgetCooling(),
                new BudgetMotherboard(),
                new BudgetCase(),
                new BudgetPowerSupply()
        );

        assertFalse(result);
    }

    @Test
    void incompatibleRamAndMotherboardShouldFail() {
        CompatibilityChecker checker = new CompatibilityChecker();

        boolean result = checker.isCompatible(
                new BudgetCPU(),
                new BudgetGPU(),
                new GamingRAM(),
                new BudgetCooling(),
                new BudgetMotherboard(),
                new BudgetCase(),
                new GamingPowerSupply()
        );

        assertFalse(result);
    }
}