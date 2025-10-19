public class CalculadorDeImpostos {

    public void calcular(Tributavel t) {
        double imposto = t.getValorImposto();
        System.out.println("Imposto calculado: R$ " + imposto);
    }
}