
package exercicio_OO;

import java.lang.runtime.SwitchBootstraps;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNometitular("DENI");

        System.out.println(conta.getNometitular());

        Scanner iput = new Scanner(System.in);



        int op;

            do {
                System.out.println("Digite 2 para Saque");
                System.out.println("Digite 3 para Deposito");
                System.out.println("Digite 4 para Pix");
                System.out.println("Digite 5 para Transferencia");
                System.out.println("Digite 6 para Verificar Saldo");
                System.out.println("Digite 7 para Verificar Horario");
                System.out.println("Digite 8 para Verificar Informacoes");
                System.out.println("Digite 9 para Sair");

                exibirMenu();
                String x = iput.nextLine();
                System.out.println();

                switch (x.toLowerCase(Locale.ROOT)){
                    case 1 -> {
                        System.out.println("Quanto você quer sacar?");
                    double saque = iput.nextDouble();
                    String saldoFinal = conta.Sacar(saque);

                    }
                }

                op = iput.nextInt();
            }while(op!=9);



    }

    private static void exibirMenu() {
    }


}
