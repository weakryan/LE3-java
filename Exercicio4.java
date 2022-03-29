 //package Atividades;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um valor para velocidade: ");
        float valorV = entrada.nextInt();
        float conversao;
        conversao = valorV / 36;

        System.out.println("Esta velocidade convertida em metros por segundos é: " + conversao + " M/S");

    }
}
