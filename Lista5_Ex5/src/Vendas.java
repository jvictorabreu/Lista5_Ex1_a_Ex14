import java.util.Scanner;

public class Vendas {
    private double vendas;



    public double getVendas() {
        return vendas;
    }

    public void setVendas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o total em vendas: ");
        vendas = sc.nextDouble();
        this.vendas = vendas;
    }
}

