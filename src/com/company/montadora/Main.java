package com.company.montadora;

public class Main {

    public static void main(String[] args) {

        // CRIANDO O OBJETO DOS VEÍCULOS

        March nissanMarch = new March();
        Versa nissanVersa = new Versa();
        Kicks nissanKicks = new Kicks();
        Sentra nissanSentra = new Sentra();

        // ATRIBUINDO OS VALORES AOS VEICULOS

        nissanMarch.setCor("Preto");
        nissanMarch.setNumeroDePortas(4);
        nissanMarch.modelo = "Basico";

        nissanVersa.setCor("Vermelho");
        nissanVersa.setNumeroDePortas(4);
        nissanVersa.temMultimidia = true;

        nissanKicks.setCor("Branco");
        nissanKicks.setNumeroDePortas(4);
        nissanKicks.temFarolDeMilha = true;

        nissanSentra.setCor("Preto");
        nissanSentra.setNumeroDePortas(4);
        nissanSentra.temTetoSolar = true;

        // CHAMANDO AS INFORMAÇÕES E METODOS DOS VEICULOS

        System.out.println("---------- NISSAN MARCH ----------");
        nissanMarch.acelerar();
        nissanMarch.parar();

        System.out.println("---------- NISSAN VERSA ----------");
        nissanVersa.acelerar();
        nissanVersa.parar();
        nissanVersa.ligarMultimidia();
        nissanVersa.desligarMultimidia();

        System.out.println("---------- NISSAN KICKS ----------");
        nissanKicks.acelerar();
        nissanKicks.parar();
        nissanKicks.ligarFarolDeMilha();
        nissanKicks.desligarFarolDeMilha();

        System.out.println("---------- NISSAN SENTRA ----------");
        nissanSentra.acelerar();
        nissanSentra.parar();
        nissanSentra.abrirTetoSolar();
        nissanSentra.fecharTetoSolar();

    }
}
