package exercicio_03;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SeparaPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String sexo;
        List<String> grupoMasculino = new ArrayList<String>();
        List<String> grupoFeminino = new ArrayList<String>();

        System.out.println("Digite seu nome.");
        nome = scanner.nextLine();

        System.out.println("Digite seu sexo.");
        sexo = scanner.nextLine();

        scanner.close();

        if(sexo.equals("masculino")){
            grupoMasculino.add(sexo);
        }else if(sexo.equals("feminino")){
            grupoFeminino.add(sexo);
        }

        System.out.println("****Lista Grupo Masculino****");
        System.out.println(grupoMasculino);
    }
}
