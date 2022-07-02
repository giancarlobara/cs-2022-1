package Polimorfismo.Exercicio01;


import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> jaulas;

    public Zoologico(ArrayList<Animal> jaulas) {
        this.jaulas = jaulas;
    }

    public ArrayList<Animal> getJaulas() {
        return jaulas;
    }

    public void setJaulas(ArrayList<Animal> jaulas) {
        this.jaulas = jaulas;
    }
}