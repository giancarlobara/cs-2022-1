package Polimorfismo.Exercicio01;

public class Cavalo extends Animal{
    public Cavalo(String nome, Integer idade) {
        super(nome, idade);
    }
    @Override
    public String emitirSom(){
        //System.out.println("Cavalo relinchou: INRRINNNHNNMNHINNNM");
        return "Cavalo relinchou: INRRINNNHNNMNHINNNM";
    }
    public String correr(){
        return "Pocotó pocotó";
    }
}
