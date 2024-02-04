package br.com.cubos.exercicios.orientacaoObjetos.exercicio04;

public class Carro extends Veiculo{
    private String concessionaria;
    public Carro(String linha,int ano,String modelo,String cor,String concessionaria){
        super(linha,ano,modelo,cor);
        this.concessionaria = concessionaria;
    }

    public String getConcessionaria() {
        return concessionaria;
    }

    public String getLinha(){
        return this.linha;
    }


}
