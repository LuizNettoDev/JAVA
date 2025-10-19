public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, String numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}