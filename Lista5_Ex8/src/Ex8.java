import java.util.Scanner;

// 8- Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        informarQuantDigitos(num);
    }
    public static void informarQuantDigitos(int n){
        n = Math.abs(n);
        int dig;
        if (n == 0){
            dig = 1;
        } else {
            dig = (int) (Math.log10(n) + 1);
        }
        System.out.printf("O número %s possui %s digitos.", n, dig);
    }
}
