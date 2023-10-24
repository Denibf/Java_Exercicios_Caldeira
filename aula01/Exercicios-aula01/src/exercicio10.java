//Crie um programa em Java que peça ao usuário para inserir
// uma temperatura em graus Celsius e,em seguida, converta essa
// temperatura em graus Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32.
// Exiba o resultado na tela.

import java.util.Scanner;
public class exercicio10 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em graus Celsius");

        int grauCelsius = scanner.nextInt();

        int Fahrenheit = (grauCelsius * 9/5) + 32;

        System.out.println("Em Fahrenheit a temperatura seria de: " + Fahrenheit);

        scanner.close();
    }
}
