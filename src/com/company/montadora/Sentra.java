package com.company.montadora;

public class Sentra extends Carros implements Motor2_0 {

    boolean temTetoSolar;

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor 2.0");
    }

    public void abrirTetoSolar(){
        if (temTetoSolar = true){
            System.out.println("Teto solar aberto");
        } else {
            System.out.println("Este carro nao tem teto solar");
        }
    }

    public void fecharTetoSolar(){
        if (temTetoSolar = true){
            System.out.println("Teto solar fechado");
        } else {
            System.out.println("Este carro nao tem teto solar");
        }
    }

}
