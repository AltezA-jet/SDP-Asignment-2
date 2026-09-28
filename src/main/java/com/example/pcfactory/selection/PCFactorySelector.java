package com.example.pcfactory.selection;

import com.example.pcfactory.factories.BudgetPCFactory;
import com.example.pcfactory.factories.GamingPCFactory;
import com.example.pcfactory.factories.PCFactory;
import com.example.pcfactory.factories.ProfessionalPCFactory;

public class PCFactorySelector {

    public static PCFactory selectFactory(String type) {

        return switch (type.toLowerCase()) {
            case "budget" -> new BudgetPCFactory();
            case "gaming" -> new GamingPCFactory();
            case "professional" -> new ProfessionalPCFactory();
            default -> throw new IllegalArgumentException(
                    "Unknown PC family: " + type
            );
        };
    }
}