//Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
// em seguida, calcule e exiba a idade.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");

        int ano = scanner.nextInt();

        int anoatual = LocalDateTime.now().getYear();

        int idade = anoatual - ano ;

        System.out.println("Você tem " + idade + " ano(s)");
    }
}
