import java.util.Scanner;

// 3- Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.

public class Soma3Argumentos {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 3 números para serem somados: \n1º: ");
        a = sc.nextInt();
        System.out.print("2º: ");
        b = sc.nextInt();
        System.out.print("3º: ");
        c = sc.nextInt();

        System.out.println("\nO resultado da soma é: " + soma(a, b, c));

    }

    public static int soma(int a, int b, int c){
        int soma = a + b + c;
        return soma;
    }
}
