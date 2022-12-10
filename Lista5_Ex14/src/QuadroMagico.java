/*
14- Quadrado mágico.
Um quadrado mágico é aquele dividido em linhas e colunas, com um número em cada posição e no qual a soma das linhas,
colunas e diagonais é a mesma. Por exemplo, veja um quadrado mágico de lado 3, com números de 1 a 9:

8  3  4
1  5  9
6  7  2
Elabore uma função que identifica e mostra na tela todos os quadrados mágicos com as características acima.
Dica: produza todas as combinações possíveis e verifique a soma quando completar cada quadrado.
Usar um vetor de 1 a 9 parece ser mais simples que usar uma matriz 3x3.
 */

public class QuadroMagico {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz [0][0] = 8;
        matriz [0][1] = 3;
        matriz [0][2] = 4;
        matriz [1][0] = 1;
        matriz [1][1] = 5;
        matriz [1][2] = 9;
        matriz [2][0] = 6;
        matriz [2][1] = 7;
        matriz [2][2] = 2;

        if (eQuadrMagico(matriz)){
            System.out.println("Esta matriz é um quadrado mágico.");
        }else {
            System.out.println("Esta matriz não é um quadrado mágico.");
        }
    }


    public static boolean eQuadrMagico (int [][] matriz){
        int soma = 0;
        int soma2 = 0;

        // somar 1ª linha
        for (int j = 0; j < matriz[0].length; j++){
            soma = soma + matriz[0][j];
        }
        // somar outras linhas
        for (int i = 1; i < matriz.length; i++){
            soma2 = 0;
            for(int j = 0; j < matriz[i].length; j++){
                soma2 = soma2 + matriz[i][j];
            }
            if(soma2 != soma){
                return false;
            }
        }
        // somar colunas
        for (int j = 0; j < matriz[0].length; j++){
            soma2 = 0;
            for(int i = 0; i < matriz.length; i++ ){
                soma2 = soma2 + matriz[i][j];
            }
            if (soma2 != soma){
                return false;
            }
        }
        // somar diagonais
        soma2 = 0;
        for(int i = 0; i < matriz.length; i++){
            soma2 = soma2 + matriz[i][i];
        }
        if(soma2 != soma){
            return false;
        }
        // nova diagonal
        soma2 = 0;
        int i = 0;
        for (int j = matriz.length - 1; j >=0; j--){
            soma2 = soma2 + matriz[i][j];
            i++;
        }
        if (soma2 != soma){
            return false;
        }
        return true;
    }
}
