package br.com.cubos.exercicios.introducao;

public class Exercicio_05 {
    //Escreva um programa que utilize o loop `foreach` para percorrer
    //e exibir os elementos de um array.

    public static void main(String[] args) {
        String[] nomes = {"Ewerton","Bernardo","Benjamim","Enzo"};

        for(String nome : nomes){
            System.out.println("Seja bem-vindo " + nome);
        }
    }
}
