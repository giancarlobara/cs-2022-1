package tratamentoexcecao.exercicio3;

import java.util.Scanner;

public class TratamentoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        Login l1 = new Login("Gianzinho", "batatinha123");

        try {
            System.out.println("Digite o usuário:");
            usuario = sc.next();

            System.out.println("Digite sua senha:");
            senha = sc.next();
            System.out.println(l1.fazerLogin(usuario, senha));
        }
        catch (LoginInvalidoException loginInvalidoException) {
            System.out.println(loginInvalidoException);
        }
    }
}
