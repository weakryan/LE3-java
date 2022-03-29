import java.util.Scanner;

//package Atividades;

public class Exercicio6 {
        public static void main(String[] args) {
    
            Scanner entrada = new Scanner(System.in);
            System.out.print("Informe a temperatura em celsius: ");
            float celsius = entrada.nextFloat();

            float conversao = celsius * 9/5 + 32;

            System.out.println(conversao);

  
     }
}