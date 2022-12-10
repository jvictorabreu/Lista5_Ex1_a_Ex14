import java.util.Scanner;

// 1- Faça um programa para imprimir:
//    1
//    2   2
//    3   3   3
//    .....
//    n   n   n   n   n   n  ... n
//  para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.


public class PrintNesimaLinha {
    public static void main(String[] args) {
        printN();
    }


    public static int printN(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i<=n; i++){
            int q = 0;
            while (q < i){
                System.out.print(i +" ");
                q = q + 1;
                if (q == i){
                    System.out.print("\n");
                }
            }
        }
        return n;
    }
}
