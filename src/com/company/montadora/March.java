package com.company.montadora;

public class March extends Carros implements Motor1_0 {

    String modelo;

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor 1.0");
    }
}
