//Peça ao usuário que digite uma palavra ou frase e conte quantas vogais (a, e, i, o, u) estão
// presentes. Exiba o número de vogais na tela.

import java.util.Scanner;
public class exercicio11 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase");
        String entrada = scanner.nextLine().toLowerCase();

        int vogais = 0;


        for (int i = 0; i < entrada.length(); i++ ) {

            char letras = entrada.charAt(i);

            if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
                vogais++;
            }

        }
        System.out.println("As quantidade de vogais que tem é: " + vogais);


    }
}
