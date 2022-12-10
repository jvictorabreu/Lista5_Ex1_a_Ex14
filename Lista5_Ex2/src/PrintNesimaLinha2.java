import java.util.Scanner;

// 2- Faça um programa para imprimir:
//    1
//    1   2
//    1   2   3
//    .....
//    1   2   3   ...  n
//  para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.


public class PrintNesimaLinha2 {
    public static void main(String[] args) {
        printN();
    }

    public static int printN() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            int q = 1;
            while (q <= i) {
                System.out.print(q + " ");
                q = q + 1;
                if (q > i) {
                    System.out.print("\n");
                }
            }
        }
        return n;
    }
}
