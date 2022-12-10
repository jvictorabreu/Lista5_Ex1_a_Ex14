import java.util.Scanner;

public class Data {

    // Função para formatar e imprimir data formatada.
    public void formatarData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data no formato (dd/mm/aaaa): ");
        String dataString = sc.nextLine();

        String[] dataSeparada = dataString.split("/");

        while (validaData(Integer.parseInt(dataSeparada[0]), Integer.parseInt(dataSeparada[1]), (dataSeparada[2]))){
            System.out.println("Data incorreta\nDigite novamente:");
            dataString = sc.nextLine();
            dataSeparada = dataString.split("/");
        }

        System.out.println("Data formatada: " + dataSeparada[0] + " de " + retornaMes(Integer.parseInt(dataSeparada[1])) + " de " + dataSeparada[2]);
    }


    // Função para validar se a data foi inserida corretamente.
    private boolean validaData(int dia, int mes, String ano){
        boolean incorreta = false;

        if ((dia < 1) || (dia > 31)){
            incorreta = true;
        } else if((mes < 1) || (mes > 12)){
            incorreta = true;
        } else if(ano.length() != 4){
            incorreta = true;
        }

        return incorreta;
    }


    // Função para retornar o mês referente à posição [1] do vetor.
    private static String retornaMes(int mes){
        String[] m = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho",
                "agosto", "setembro", "outubro", "novembro", "dezembro"};

        return m[mes - 1];
    }
}
