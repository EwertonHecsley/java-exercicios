package br.com.cubos.exercicios.orientacaoObjetos.exercicio03;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        System.out.println(conta.getSaldo());
        System.out.println(conta.sacar(1));


        conta.depositar(100);

        System.out.println(conta.getSaldo());

        System.out.println(conta.sacar(50));

        System.out.println(conta.getSaldo());

    }
}
