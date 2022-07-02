package Polimorfismo.Exercicio01;

public class Preguica extends Animal{

    public Preguica (String nome, Integer idade) {
        super(nome, idade);
    }
    @Override
    public String emitirSom(){
        //System.out.println("A preguiça dormiu: ZZZ ZZZ ZZZ");
        return "A preguiça dormiu: ZZZ ZZZ ZZZ";
    }
    public String subirEmArvore(){
        return "Esssccaaallaaanndddoooo";
    }
}
