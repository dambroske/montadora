package com.company.montadora;

public class Versa extends Carros implements Motor1_6 {

    boolean temMultimidia;

    @Override
    public void acelerar(){
        System.out.println("Acelerando motor 1.6");
    }

    public void ligarMultimidia(){
        if (temMultimidia = true){
            System.out.println("Multimidia ligado");
        } else {
            System.out.println("Este carro nao tem multimidia");
        }
    }

    public void desligarMultimidia(){
        if (temMultimidia = true){
            System.out.println("Multimidia desligado");
        } else {
            System.out.println("Este carro nao tem multimidia");
        }
    }

}
