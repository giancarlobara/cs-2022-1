package Polimorfismo.Exercicio01;

public class Cachorro extends Animal {

    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "O cachorro latiu: Au au auau au au";
    }

    public String correr() {
        return "Pega tiu pega tiu";
    }
}
