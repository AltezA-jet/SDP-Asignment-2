package com.example.pcfactory;

import com.example.pcfactory.client.PCClient;
import com.example.pcfactory.factories.PCFactory;
import com.example.pcfactory.selection.PCFactorySelector;

public class Main {

    public static void main(String[] args) {

        PCClient client = new PCClient();

        PCFactory factory = PCFactorySelector.selectFactory("gaming");

        client.buildPC(factory);
    }
}