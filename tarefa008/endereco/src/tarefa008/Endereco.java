package tarefa008;

/**
 *  Classe para representar Endereço
 *  Autor: Giancarlo Oliveira Silva
 *  Data: 15/07/2022
 */

public class Endereco {
    private Integer numero;
    private String complemento;
    private Integer cep;
    private Bairro bairro;
    private Logradouro logradouro;
    private TipoEndereco tipoEndereco;

    public Endereco(Integer numero, String complemento, Integer cep, Bairro bairro, Logradouro logradouro, TipoEndereco tipoEndereco) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.tipoEndereco = tipoEndereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
