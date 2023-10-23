//Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
//Se for menor de 16 anos, avisar que não pode votar;
//Se tiver 16 ou 17, avisar que o voto é facultativo;
//Se tiver mais de 65, avisar que também é facultativo o voto;
//De 18 até 65, é obrigatório votar.


import java.util.Scanner;

public class exercicio6 {
    public static void main(String []args){

        int idademin,idademedia,idademedia2,idademais65,idadeobrigatorio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
            int idade = scanner.nextInt();

         idademin = 16;
         idademedia = 16;
         idademedia2 =17;
         idademais65 = 65;
         idadeobrigatorio = 18;


         if (idade < idademin) {
             System.out.println("Você não pode votar");
         }else {
             if(idade==idademedia){
                 System.out.println("O voto é facultativo");
             } else if (idade==idademedia2) {
                 System.out.println("O voto é facultativo");
             }
         }

         if (idade>idademais65){
             System.out.println("O voto é facultativo");
         }else{
             if(idade>=idadeobrigatorio){
                 System.out.println("O voto é obrigatório");
             }
         }

    }
}




