package com.example.pcfactory.factorymethod;

public class GamingComputer implements Computer {

    @Override
    public void build() {
        System.out.println("Building a gaming computer");
    }
}