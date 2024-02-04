package br.com.cubos.exercicios.introducao;

public class Exercicio_02 {

    //Escreva um programa que utilize a estrutura de condição `if`
    //para verificar se um número é positivo, negativo ou zero.

    public static void main(String[] args) {
        int valor = -1;

        if(valor < 0){
            System.out.println("O valor: " + valor + " é negativo.");
        }else if(valor > 0) {
            System.out.println("O valor: " + valor + " é positivo.");
        }else {
            System.out.println("O valor é igual a zero.");
        }
    }
}
