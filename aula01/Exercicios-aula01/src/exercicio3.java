

import java.util.Scanner;
public class exercicio3 {
    public static void main (String[]args){
            double numero1, numero2, numero3,menornum, maiornum, media;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro número");
            numero1 = scanner.nextDouble();
            System.out.println(numero1);
            System.out.println("Digite o segundo número");
            numero2 =scanner.nextDouble();
            System.out.println(numero2);
            System.out.println("Digite o teeceiro número");
            numero3 = scanner.nextDouble();
            System.out.println(numero3);

            //maior numero
            if (numero1 > numero2) {
                    if (numero1 > numero3) {
                            maiornum = numero1;
                    } else {
                            maiornum = numero3;
                    }
            } else {
                    if (numero2 > numero3){
                            maiornum = numero2;
                    }else{
                            maiornum = numero3;
                    }
            }
            //menor numero
            if (numero1<numero2){
                    if(numero1<numero3){
                    menornum = numero1;
                    }else {
                            menornum = numero3;
                    }
            }else {
                    if (numero2<numero3){
                            menornum = numero2;
                    }else {
                            menornum = numero3;
                    }
            }

            media = (numero1+ numero2+numero3)/3.0;

            System.out.println("O maior numero é: " + maiornum);
            System.out.println("O menor número é: " +menornum);
            System.out.println("A médria aritimetica é: " + media);
    }
}
