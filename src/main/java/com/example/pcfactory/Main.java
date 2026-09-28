package com.example.pcfactory;

import com.example.pcfactory.client.PCClient;
import com.example.pcfactory.factories.PCFactory;
import com.example.pcfactory.selection.PCFactorySelector;

public class Main {

    public static void main(String[] args) {

        String type = args.length > 0 ? args[0] : "gaming";

        PCFactory factory = PCFactorySelector.selectFactory(type);

        PCClient client = new PCClient();
        client.buildPC(factory);
    }
}