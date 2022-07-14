package tratamentoexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um valor inteiro:");
            int numero1 = sc.nextInt();
            System.out.print("Digite um valor inteiro:");
            int numero2 = sc.nextInt();

            System.out.println(numero1+ " / " + numero2 + " = " + (numero1/numero2));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("ERRO - Ocorreu uma divisão por zero!");
        }
         catch (InputMismatchException inputMismatchException) {
        System.out.println("ERRO - Digite só algarismos!");
        }
    }
}
