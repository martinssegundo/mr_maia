package exemplos.oo;

import java.util.Scanner;

public class Leitor {
    private Scanner sc = new Scanner(System.in);

    public int leInteiro(String textoExibicao){
        System.out.println(textoExibicao);
        return sc.nextInt();
    }
}
