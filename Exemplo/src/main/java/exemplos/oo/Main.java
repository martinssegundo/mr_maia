package exemplos.oo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Calculadora calculadora = new Calculadora();
        Leitor leitor = new Leitor();

        int opcao = leitor.leInteiro(menu.buildMenu());
        int primeiroNumero = leitor.leInteiro("Primeiro numero");
        int segundoNumero = leitor.leInteiro("Segundo numero");


        switch (opcao) {
            case 1:
                System.out.println(calculadora.soma(primeiroNumero, segundoNumero));
                break;
            default: System.out.println(calculadora.subtracao(primeiroNumero, segundoNumero));
        }
    }
}