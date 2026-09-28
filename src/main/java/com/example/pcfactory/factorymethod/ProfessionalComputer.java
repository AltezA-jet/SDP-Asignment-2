package com.example.pcfactory.factorymethod;

public class ProfessionalComputer implements Computer {

    @Override
    public void build() {
        System.out.println("Building a professional computer");
    }
}