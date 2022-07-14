package tratamentoexcecao.exercicio4;

public class ContaBancaria {
    private Double saldo;

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if(saldo < valor) {
            throw new SaldoInsuficienteException("Não foi possível realizar o saque. Saldo insuficiente.");
        } else {
            saldo = saldo - valor;
        }
    }
}
