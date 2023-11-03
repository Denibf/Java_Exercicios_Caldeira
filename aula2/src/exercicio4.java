/*Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher
a operação que deseja realizar. Durante a execução o programa deve perguntar ao usuário
 se ele deseja continuar, se ele não quiser, deve digitar ‘n’ para o programa encerrar.
 */

import java.util.Locale;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo  número:");
            int num2 = scanner.nextInt();

            scanner.nextLine();



            System.out.println("Escolha a operação que você deseja realizar :");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir ");
            System.out.println("n - Para encerrar a calculadora");


            String opção = scanner.nextLine().toLowerCase();


            switch (opção) {
                case "1":
                    int soma = num1 + num2;
                    System.out.println("O resultado da soma é: " + soma);
                    break;

                case "2":
                    int subtração = num1 - num2;
                    System.out.println("O resultado da subtração é: " + subtração);
                    break;

                case "3":
                    int multiplicação = num1 * num2;
                    System.out.println("O resultado da multiplicação é: " + multiplicação);
                    break;

                case "4":
                    int divisão = num1 / num2;
                    System.out.println("O resultado da divisão é: " + divisão);
                    break;

                case "n":
                    System.out.println("Encerrar calculadora");
                    continuar = false;
                    break;

                default: System.out.println("Invalido");
            }

        }

    }
}
