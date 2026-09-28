package com.example.pcfactory.client;

import com.example.pcfactory.business.PCConfiguration;
import com.example.pcfactory.factories.PCFactory;

public class PCClient {

    public void buildPC(PCFactory factory) {

        PCConfiguration configuration = new PCConfiguration(factory);

        System.out.println("Building PC");
        configuration.printSummary();
    }
}