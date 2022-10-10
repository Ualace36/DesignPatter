package treinoEstrategy;

public class PedidoUtilitario extends Pedido{
private String descricao;

    public PedidoUtilitario(double valor) {
     super(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
