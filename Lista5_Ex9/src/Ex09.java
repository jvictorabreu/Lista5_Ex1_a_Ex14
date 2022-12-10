
/* 9- Reverso do número. Faça uma função que retorne o reverso de um número inteiro informado.
Por exemplo: 127 -> 721.*/

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        Integer num = sc.nextInt();
        System.out.printf("\nO reverso do número %s é: %s", num, reversoNumero(num));
    }

    public static String reversoNumero(Integer n){
        String c = "", b = n.toString();

        for (int i= b.length(); i>0; i--){
            c += b.substring(i - 1, i);
        }
        return c;
    }
}
