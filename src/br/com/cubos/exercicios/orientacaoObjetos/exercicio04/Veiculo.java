//Desenvolva uma hierarquia de classes para representar veículos,
//com uma classe base Veiculo e subclasses como Carro, Moto e Caminhao.
package br.com.cubos.exercicios.orientacaoObjetos.exercicio04;

public class Veiculo {
    protected String linha;
    protected int ano;

    protected String modelo;

    protected String cor;

    public Veiculo(String linha,int ano,String modelo,String cor){
        this.linha = linha;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

}
