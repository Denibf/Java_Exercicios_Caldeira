//Criar para uma empresa de consórcio. No teste inicial,
// você deve perguntar para o usuárioa idade dele
// e o seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.

import java.util.Scanner;
public class exercicio7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Qual o valor do seu salário?");
        double salario = scanner.nextDouble();

        if (idade>=18){
            System.out.println("Você tem idade suficiente para comprar um automável");
        }else{
            System.out.println("Você não pode comprar um automóvel pois é menor de idade");
        }

        if (salario>=2000.00){
            System.out.println("Você tem condições de comprar um automóvel");
        }else{
            System.out.println("Seu sálario não permite fazer a compre de um automóvel");
        }

    }
}
