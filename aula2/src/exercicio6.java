import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um frase/palavra");
        String input = scanner.nextLine();

        String reverseVersion2 = reverseTextV2(input);
        System.out.println(" A string ao contrário é: " + reverseVersion2);

        scanner.close();
    }
    public static String reverseTextV2(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }

}
