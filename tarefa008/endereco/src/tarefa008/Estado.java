package tarefa008;

/**
 *  Classe para representar Estado
 *  Autor: Giancarlo Oliveira Silva
 *  Data: 15/07/2022
 */

public class Estado {
    String nome;
    private String sigla;
    private Pais pais;

    public Estado(String nome, String sigla, Pais pais) {
        this.nome = nome;
        this.sigla = sigla;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
