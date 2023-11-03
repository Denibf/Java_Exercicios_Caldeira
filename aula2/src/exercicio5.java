/*Escreva um programa que separa a
string em duas metades e imprime a primeira parte.
 */



import java.util.Scanner;
public class exercicio5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite alguma frase/palavra");
        String input = scanner.nextLine();

        String halfinput = input.substring(0,(input.length()/2));

        if (input.length() % 2 == 0) {
            System.out.println("Metade do seu texto: " + halfinput);
        } else {
            System.out.println("Seu texto não pode ser dividido em partes iguais");
            System.out.println("Metade aproximada do seu texto: " + halfinput);
        }

        scanner.close();

    }
}
