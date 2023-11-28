/*Crie um projeto Java utilizando o Maven que contenha uma lista de strings.
Em seguida, utilize Streams para realizar as seguintes operações: a) Conte o número total de strings na lista.
b) Encontre a string mais longa presente na lista. c)
 Conte quantas vezes cada string aparece na lista e exiba a contagem para as 5 strings mais frequentes.
*/
package org.example;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Giovana");
        nomes.add("Gustavo");
        System.out.println("O número total de Strings é " + nomes.size());


    }
}