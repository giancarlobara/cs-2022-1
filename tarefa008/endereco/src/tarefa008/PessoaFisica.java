package tarefa008;

import java.util.ArrayList;
import java.util.Date;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private ArrayList<Endereco> Endereco;

    public PessoaFisica(String nome, String sexo, Date dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<tarefa008.Endereco> getEndereco() {
        return Endereco;
    }

    public void setEndereco(ArrayList<tarefa008.Endereco> endereco) {
        Endereco = endereco;
    }
}
