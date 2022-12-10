import java.util.Scanner;

// 4- Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de
// caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.

public class PouN {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();
        System.out.println("\nO seu número tem valor: " + posOuNeg(n));
    }

    public static String posOuNeg(int n){
            String resultado;

        if (n > 0){
            resultado = "P";
        } else{
            resultado = "N";
        }
        return resultado;
    }
}
