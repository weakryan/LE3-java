package Atividades;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = entrada.nextInt();

        int antecessor;
        antecessor = numero - 1;
        System.out.println("Antecessor: " + antecessor);
        int sucessor;
        sucessor = numero + 1;
        System.out.println("Sucessor: " + sucessor);

  }
 }
    

