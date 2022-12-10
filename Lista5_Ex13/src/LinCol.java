import java.util.Scanner;

/*
13- Desenha moldura.
Construa uma função que desenhe um retângulo usando os caracteres ‘+’ , ‘−’ e ‘| ‘.
Esta função deve receber dois parâmetros, linhas e colunas, sendo que o valor por omissão
é o valor mínimo igual a 1 e o valor máximo é 20. Se valores fora da faixa forem informados,
eles devem ser modificados para valores dentro da faixa de forma elegante.
*/

public class LinCol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLinhas, numColunas;

        System.out.print("Digite o numero de linhas: ");
        numLinhas = sc.nextInt();

        if (validaLinhas(numLinhas)){
            numLinhas = 1;
            System.out.println("Número de linhas excedeu o limite(1 a 20), imprimindo 1 linha como padrão.\n");
        }

        System.out.print("Digite o numero de colunas: ");
        numColunas = sc.nextInt();

        if (validaColunas(numColunas)){
            numColunas = 20;
            System.out.println("Número de colunas excedeu o limite(1 a 20), imprimindo 20 colunas como padrão.");
        }
        System.out.println("");

        montarRetangulo(numLinhas, numColunas);

    }

    public static void montarRetangulo(int numLinhas, int numColunas){
        for(int i = 1; i <= numLinhas; i++){
            for(int j = 1; j <= numColunas; j++){
                if ((i == 1)||(i == numLinhas)) {
                    System.out.print(" - ");
                } else if ((j == 1) || (j == numColunas)) {
                    System.out.print(" | ");
                } else {
                    System.out.print(" + ");
                }
            }
            System.out.println("");
        }
    }

    public static boolean validaLinhas(int linha){
        boolean erro = false;
        if (linha < 1){
            erro = true;
        } else if(linha > 20){
            erro = true;
        }
        return erro;
    }

    public static boolean validaColunas(int coluna){
        boolean erro = false;
        if (coluna < 1){
            erro = true;
        } else if(coluna > 20){
            erro = true;
        }
        return erro;
    }
}
