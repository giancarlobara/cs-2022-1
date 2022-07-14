package tratamentoexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int v[] = new int[n];
        int i = 1;
        int count;

        try {
            System.out.println("Digite até 10 números inteiros");
            count = sc.nextInt();
            while (count != 0) {
                v[i] = count;
                count = sc.nextInt();
                i++;
            }
            System.out.println("Valores:");
            for(int j = 0; j < v.length; j++){
                if(v[j]!=0)System.out.println(v[j]);
            }
            System.out.println("0");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("ERRO! Digite só até 10 números.");
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("ERRO - Digite só números!");
        }
    }
}
