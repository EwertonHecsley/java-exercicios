package main.java.exercicio_02;

import java.util.Scanner;

public class ControlesAlunos{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome;        

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite seu nome: ");

        nome = s.nextLine();

        System.out.println("Digite sua primeira nota:");
        nota1 = s.nextDouble();

        System.out.println("Digite sua segunda nota:");
        nota2 = s.nextDouble();

        System.out.println("Digite sua terceira nota:");
        nota3 = s.nextDouble();

        System.out.println("Digite sua quarta nota:");
        nota4 = s.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        String mediaFormatada = String.format("%.1f", media);
        
        if(media >7){
            System.out.println("O aluno: " + nome + " está aprovado com a média: " + mediaFormatada);
        }else if(media < 7 && media >=6){
            System.out.println("O aluno: " + nome + " está em recuperação com a média: " + mediaFormatada);
        }else{
            System.out.println("O aluno: " + nome + " está reprovado com a média: " + mediaFormatada);
        }

    }
}

