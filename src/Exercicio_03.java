public class Exercicio_03 {
    //Desenvolva um programa que use a operação ternária para
    //determinar se um número é par ou ímpar e exibir essa informação.

    public static void main(String[] args) {
        int valor = 2;
        String result = (valor % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(result);
    }
}
