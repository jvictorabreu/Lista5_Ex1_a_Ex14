import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrocaOrdem {
    public static String embaralhaPalavra() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra para ser embaralhada: ");
        String s = sc.next();

        ArrayList<String> letras = new ArrayList<String>();
        String palavra = "";

        for (int i = 0; i < s.length(); i++) {
            letras.add(String.valueOf(s.charAt(i)));
        }

        Collections.shuffle(letras);

        for (int i = 0; i < s.length(); i++) {
            palavra += letras.get(i);
        }
        return palavra;
    }
}
