package tratamentoexcecao.exercicio3;

public class Login {
    String usuario;
    String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
            return true;
        }
        throw new LoginInvalidoException("Usuário ou senha inválidos");
    }
}
