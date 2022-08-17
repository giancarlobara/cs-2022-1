package generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Giancarlo");
        resultadoConcurso.adicionar(2, "Pedro Ivo");
        resultadoConcurso.adicionar(3, "Gui");
        resultadoConcurso.adicionar(4, "Gilmar");
        resultadoConcurso.adicionar(2, "Hamze");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));
    }
}
