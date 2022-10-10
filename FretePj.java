package treinoEstrategy;

public class FretePj implements Frete{
    @Override
    public double calcular(double valor) {
        return valor * 0.2;
    }
}
