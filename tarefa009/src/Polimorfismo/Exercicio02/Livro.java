package Polimorfismo.Exercicio02;

public class Livro extends Produto{
    private String autor;

    public Livro(String autor, String descricao) {
        this.autor = autor;
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getDescricao() {
        return super.getDescricao() + "/" + getAutor();
    }
}
