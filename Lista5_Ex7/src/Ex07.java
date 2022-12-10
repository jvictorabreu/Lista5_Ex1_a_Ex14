
// 7- Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta.
// O programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores para
// a função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou.
// O programa deverá então exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro
// valor de prestação e assim continuar até que seja informado um valor igual a zero para a prestação. Neste momento o
// programa deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações
// pagas no dia. O cálculo do valor a ser pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da
// prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valPrestacao;
        int diasAtraso, quantPrestacoes = 0;
        double totalPrestacoes = 0;

        do {
            System.out.print("\nDigite o valor da prestação: ");
            valPrestacao = sc.nextDouble();
            System.out.print("Quantos dias em atraso?: ");
            diasAtraso = sc.nextInt();

            System.out.println(
                    "\n=====================================\n" +
                    "O valor a ser pago é de R$ " + valorPagamento(valPrestacao,diasAtraso) +
                    "\n=====================================");

            totalPrestacoes += valorPagamento(valPrestacao, diasAtraso);
            quantPrestacoes = quantPrestacoes + 1;
        } while (valPrestacao != 0);

        // Relatório
        System.out.println(
                "\n*************** RELATÓRIO DO DIA ***************\n" +
                "-Prestações pagas no dia: " + (quantPrestacoes-1) +
                "\n-Valor total das prestações pagas: R$ " + totalPrestacoes +
                "\n************************************************");
    }

    public static double valorPagamento(double v, int d){
        if (d == 0){
            v = v;
        } else if (d > 0){
            v = v + (v * 0.03) + ((v* 0.01) * d);
        }
        return v;
    }
}


