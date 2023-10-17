import java.util.Scanner;
public class exercicio2 {
    public  static void main (String[] args) {
        Scanner peganome = new Scanner(System.in);
        System.out.print("insira o primeiro numero:");
        String numero1 = peganome.nextLine();
        System.out.print("insira o segundo numero:");
        String numero2 = peganome.nextLine();
        System.out.print("esses são os dois números " + numero1 + " e 4" + numero2);
    }
}

