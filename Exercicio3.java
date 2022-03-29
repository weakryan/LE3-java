package Atividades; 

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        int anoAtual;
        anoAtual = 2022;
        int nascimento;
        nascimento = anoAtual - idade;
        System.out.println("Seu ano de nascimento é: " + nascimento);

    
  }
}