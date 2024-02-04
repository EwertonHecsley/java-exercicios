//Crie uma classe ContaBancaria com atributos de saldo e
//métodos para depositar, sacar e verificar saldo, usando getters e setters.
package br.com.cubos.exercicios.orientacaoObjetos.exercicio03;

public class ContaBancaria {
    private int saldo = 0;

    public int getSaldo(){
        return  this.saldo;
    }
    public String depositar(int valor){
        this.saldo += valor;
        return "Depósito realizado com sucesso.";
    }

    public String  sacar(int valor){
        if(this.saldo ==0){
            return "Conta não possui saldo.";
        } else if (valor > this.saldo) {
            return "Saldo insuficiente para saque.";
        }else {
            this.saldo -= valor;
            return "Saque realizado com sucesso! saldo atual: " + this.saldo;
        }
    }

}
