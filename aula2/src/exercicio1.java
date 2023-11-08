//Crie um programa que determine e escreva os números primos
// compreendidos entre um intervalo fornecido pelo usuário.


import java.util.Scanner;
public class exercicio1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Determina numeros primos no intervalo que você deseja: ");
        System.out.println("Digite o primeiro número: ");
         int num1 = scanner.nextInt();

         System.out.println("Digite o segundo número: ");
         int num2 = scanner.nextInt();

       System.out.println("Intervalo escolhoido["+ num1 + ", "+ num2+"]");

        

    }
}
