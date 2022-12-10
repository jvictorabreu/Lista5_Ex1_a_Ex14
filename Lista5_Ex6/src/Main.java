// 6-Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o programa deve
// converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. Deve haver pelo menos duas funções: uma para
// fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M.
// Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M.
// Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar.

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minutos;
        String opcao;

        do {
            System.out.print("Digite a hora: ");
            hora = sc.nextInt();
            System.out.print("Digite os minutos: ");
            minutos = sc.nextInt();

            conversaoHora(hora, minutos);
            System.out.print("Deseja converter novamente?\nDigite S ou N: ");
            opcao = sc.next();
        } while (!Objects.equals(opcao, "n"));
    }

    public static void conversaoHora(int h, int m) {
            if (h == 12) {
                if (m > 0) {
                    printHorario(h, m, 'P');
                } else if (m == 0) {
                    printHorario(h, m, 'A');
                }
            } else if ((h > 12) && (h < 24)) {
                h = h - 12;
                printHorario(h, m, 'P');
            } else if (h == 24) {
                h = 0;
                printHorario(h, m, 'A');
            } else if ((h < 12) && (h >= 0)) {
                printHorario(h, m, 'A');
            }
    }

    public static void printHorario(int h, int m, char t){
        System.out.println(h + ":" + m + " " + t + ".M");
    }
}
