package com.company.montadora;

public class Carros {

    private int numeroDePortas;
    private String cor;

    public Carros() {
    }



    public Carros(int numeroDePortas, String cor) {
        this.numeroDePortas = numeroDePortas;
        this.cor = cor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void parar(){
        System.out.println("Parando...");
    }

}
