import javax.swing.*;
import java.util.Random;

public class JogoCraps {
    private int round;
    private int ponto = 0;
    private int fim = 0;

    // Contructor
    public JogoCraps() {
        this.round = 1;
        this.ponto = 0;
        this.fim = 0;
    }


    public void jogarDados(){
        do {
            JOptionPane.showMessageDialog(null, "ROUND " + this.getRound());
            Random random = new Random();
            JOptionPane.showMessageDialog(null, "Jogando os dados.........");
            int d1 = random.nextInt(6) + 1;
            JOptionPane.showMessageDialog(null, "1º Dado: " + d1);
            int d2 = random.nextInt(6) + 1;
            JOptionPane.showMessageDialog(null, "2º Dado: " + d2);
            int resultado = d1 + d2;
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

            if (this.getRound() == 1){
                if ((resultado == 7) || (resultado == 11)){
                    JOptionPane.showMessageDialog(null, "Natural\nVocê venceu!!");
                    setFim(1);
                } else if((resultado == 2) || (resultado == 3) || (resultado == 12)){
                    JOptionPane.showMessageDialog(null, "Craps\nVocê perdeu!!");
                    setFim(1);
                } else{
                    JOptionPane.showMessageDialog(null, "O seu ponto é: " + resultado
                            + "\nSe tira-lo novamente antes de tirar o número 7, você vence o jogo.");
                    setPonto(resultado);
                }
            } else {
                if (resultado == this.getPonto()){
                    JOptionPane.showMessageDialog(null, "Ponto!!!\nVocê tirou o mesmo número do 1º Round.\nVocê venceu o jogo!!!");
                    this.setFim(1);
                } else if (resultado == 7){
                    JOptionPane.showMessageDialog(null, "Você tirou o número 7.\nPor isso você perdeu!!!");
                    this.setFim(1);
                } else {
                    JOptionPane.showMessageDialog(null, "Números neutros.\nVamos para mais uma rodada!!");
                }
            }
            this.setRound(this.getRound() + 1);
        }while (getFim() == 0);
    }

    // Getters and Setters
    private int getRound() {
        return round;
    }

    private void setRound(int round) {
        this.round = round;
    }

    private int getPonto() {
        return ponto;
    }

    private void setPonto(int ponto) {
        this.ponto = ponto;
    }

    private int getFim() {
        return fim;
    }

    private void setFim(int fim) {
        this.fim = fim;
    }
}
