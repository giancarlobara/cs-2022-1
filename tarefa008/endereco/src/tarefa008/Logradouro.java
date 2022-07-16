package tarefa008;

/**
 *  Classe para representar Logradouro
 *  Autor: Giancarlo Oliveira Silva
 *  Data: 15/07/2022
 */

public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;

    public Logradouro(String nome, TipoLogradouro tipoLogradouro) {
        this.nome = nome;
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
}
