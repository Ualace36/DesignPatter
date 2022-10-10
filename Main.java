package treinoEstrategy;

public class Main {
    public static void main(String[] args) {
        Frete fretecomum = new FreteComum();
        Frete fretePrime = new FretePrime();
        Frete fretepj = new FretePj();
        Frete freteExpresso = new FreteExpresso();
       Pedido pe = new PedidoUtilitario(584.02);
       pe.setTipoFrete(fretecomum);
        System.out.println("Valor do frete comum é: R$ " + pe.calcularFrete());
        pe.setTipoFrete(freteExpresso);
        System.out.println("Valor do frete Expresso é: R$ " + pe.calcularFrete());
        pe.setTipoFrete(fretePrime);
        System.out.println("Valor do frete Prime é: R$ " + pe.calcularFrete());
        pe.setTipoFrete(fretepj);
        System.out.println("Valor do frete Pj é: R$ " + pe.calcularFrete());
    }
}
