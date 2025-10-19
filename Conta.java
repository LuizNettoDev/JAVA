public abstract class Conta {
    private String agencia;
    private String numero;
    protected double saldo; // protegida para acesso por subclasses

    public Conta(String agencia, String numero, double saldoInicial) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract boolean sacar(double valor);

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}