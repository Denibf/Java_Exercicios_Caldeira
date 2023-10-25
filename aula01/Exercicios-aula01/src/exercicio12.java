//Crie um programa que converta uma quantia em dólares para outra moeda, como euros ou reais.
// Peça ao usuário para inserir a quantia em dólares e a taxa de câmbio atual.
// Em seguida, calcule e exiba o valor convertido.

import java.util.Scanner;
public class exercicio12 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma quantia em dólares");
        double dólares = scanner.nextDouble();

        double reais = dólares * 4.99;

        System.out.println("O valor convertido em reais foi: " + reais);

        scanner.close();

    }
}
