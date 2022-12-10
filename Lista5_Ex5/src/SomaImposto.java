import java.util.Scanner;

public class SomaImposto {
    public static void main(String[] args) {
        double vendas, imposto, custo;
        Scanner sc = new Scanner(System.in);

        Vendas v = new Vendas();
        v.setVendas();
        vendas = v.getVendas();

        System.out.print("\nQual o custo das vendas?: ");
        custo = sc.nextDouble();

        System.out.print("\nQual a taxa de imposto em percentual?: ");
        imposto = sc.nextDouble();

        somaImposto(vendas, imposto, custo);
    }



    public static void somaImposto(double vendas, double taxaImposto, double custo){

        double valorBase = vendas - custo;
        double converteTaxa = taxaImposto /100;
        double resultado = valorBase * converteTaxa;

        System.out.println("\nO valor a pagar de imposto é R$: " + resultado);
    }
}
