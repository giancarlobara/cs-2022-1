package Polimorfismo.Exercicio02;

public class Mouse extends Produto{
    private String tipo;

    public Mouse(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return super.getDescricao() + "/" + getTipo();
    }
}

