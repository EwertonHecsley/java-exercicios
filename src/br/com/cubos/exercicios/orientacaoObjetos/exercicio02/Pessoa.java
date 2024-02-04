//Crie uma classe Pessoa com atributos como nome, idade e sexo.
//Utilize um construtor para inicializar esses atributos.
package br.com.cubos.exercicios.orientacaoObjetos.exercicio02;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome,int idade,String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }
}
