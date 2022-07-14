package tratamentoexcecao.exercicio4;

import java.util.Scanner;

public class TratamentoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );


        ContaBancaria c1 = new ContaBancaria(500.00);

        try {
            System.out.println("Depositar: ");
            Double d = sc.nextDouble();
            c1.depositar(d);
            System.out.println("Sacar: ");
            Double s = sc.nextDouble();
            c1.sacar(s);
            System.out.println("Aguarde, contando o dinheiro");

        }

        catch (SaldoInsuficienteException saldoInsuficienteException) {
            System.out.println(saldoInsuficienteException);
        }
    }
}
