//Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um
// menu de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas.
// Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito."

import java.util.Scanner;

public class exercicio8 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma das opções:");
        System.out.println("1 Gestante");
        System.out.println("2 Idosa");
        System.out.println("3 PCD");
        System.out.println("4 Nenhuma das opções");

        int opção = scanner.nextInt();

        switch (opção){
            case 1:
                System.out.println("Gestantes tem direito a fila prioritária");
                break;
            case 2:
                System.out.println("Idosas tem direito a fila prioritária");
                break;
            case 3:
                System.out.println("PCDs tem direito a fila prioritária");
                break;
            case 4:
                System.out.println("Você não tem direito a fila prioritária");
        }

    }
}
