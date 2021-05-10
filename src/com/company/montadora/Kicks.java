package com.company.montadora;

public class Kicks extends Carros implements Motor1_6 {

    boolean temFarolDeMilha;

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor 1.6");
    }

    public void ligarFarolDeMilha(){
        if (temFarolDeMilha = true){
            System.out.println("Farol de milha ligado");
        } else {
            System.out.println("Este carro nao tem farol de milha");
        }
    }

    public void desligarFarolDeMilha(){
        if (temFarolDeMilha = true){
            System.out.println("Farol de Milha desligado");
        } else {
            System.out.println("Este carro nao tem Farol de Milha");
        }
    }
}
