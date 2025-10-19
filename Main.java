public class Main {
    public static void main(String[] args) {

        // Criando cliente
        Cliente cliente = new Cliente("Ana Silva", "123.456.789-00");

        // Criando contas
        ContaCorrente cc = new ContaCorrente("0001", "12345-6", 1000.0);
        ContaPoupanca cp = new ContaPoupanca("0001", "65432-1", 500.0);

        // Adicionando contas ao cliente
        cliente.adicionarConta(cc);
        cliente.adicionarConta(cp);

        // Operações
        System.out.println("\nSaldo inicial CC: R$ " + cc.getSaldo());
        System.out.println("Saldo inicial CP: R$ " + cp.getSaldo());

        cc.depositar(200);
        cp.depositar(100);

        cc.sacar(150); // com taxa
        cp.sacar(50);  // sem taxa

        cc.transferir(100, cp);

        System.out.println("\nApós operações:");
        System.out.println("Saldo CC: R$ " + cc.getSaldo());
        System.out.println("Saldo CP: R$ " + cp.getSaldo());

        // Cálculo de impostos
        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
        System.out.println("\nCalculando impostos sobre ContaCorrente:");
        calculadora.calcular(cc);

        // Mostrar contas do cliente
        System.out.println("\nContas do cliente " + cliente.getNome() + ":");
        for (Conta conta : cliente.getContas()) {
            System.out.println("- Conta " + conta.getNumero() + " | Saldo: R$ " + conta.getSaldo());
        }
    }
}
