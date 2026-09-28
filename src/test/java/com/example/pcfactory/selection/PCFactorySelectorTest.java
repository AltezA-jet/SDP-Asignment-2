package com.example.pcfactory.selection;

import com.example.pcfactory.factories.BudgetPCFactory;
import com.example.pcfactory.factories.GamingPCFactory;
import com.example.pcfactory.factories.PCFactory;
import com.example.pcfactory.factories.ProfessionalPCFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PCFactorySelectorTest {

    @Test
    void shouldSelectBudgetFactory() {
        PCFactory factory = PCFactorySelector.selectFactory("budget");

        assertInstanceOf(BudgetPCFactory.class, factory);
    }

    @Test
    void shouldSelectGamingFactory() {
        PCFactory factory = PCFactorySelector.selectFactory("gaming");

        assertInstanceOf(GamingPCFactory.class, factory);
    }

    @Test
    void shouldSelectProfessionalFactory() {
        PCFactory factory = PCFactorySelector.selectFactory("professional");

        assertInstanceOf(ProfessionalPCFactory.class, factory);
    }

    @Test
    void shouldRejectUnknownFamily() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PCFactorySelector.selectFactory("unknown")
        );
    }
}