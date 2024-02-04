//Crie uma classe Carro com atributos como modelo, ano e cor.
//Implemente métodos para mudar a cor e obter o modelo do carro.
package br.com.cubos.exercicios.orientacaoObjetos.exercicio01;

public class Carro {
    private String modelo;
    private int ano;
    private  String cor;

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public  void  setAno(int ano){
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
