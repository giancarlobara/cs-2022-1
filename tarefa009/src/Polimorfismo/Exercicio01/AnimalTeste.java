package Polimorfismo.Exercicio01;

import javax.swing.*;

public class AnimalTeste {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Pateta", 85);
        Animal preguica = new Preguica("Sid", 4);
        Animal cavalo = new Cavalo("Pé de Pano", 12);

        System.out.println(cachorro.emitirSom());
        System.out.println(cavalo.emitirSom());
        System.out.println(preguica.emitirSom());


        System.out.println("\nOs bichinhos foram ao veterinário!!");
        Veterinario v = new Veterinario();
        System.out.println(v.examinar(cachorro));
        System.out.println(v.examinar(cavalo));
        System.out.println(v.examinar(preguica));

        System.out.println("\nOU NÃOOOO!!Estamos enjauladossss!!");


    }
}
