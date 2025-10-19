public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(String agencia, String numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 0.10;
        double total = valor + taxa;
        if (saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }

    @Override
    public double getValorImposto() {
        return saldo * 0.01; // 1% de imposto
    }
}