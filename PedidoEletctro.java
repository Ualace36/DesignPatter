package treinoEstrategy;

public class PedidoEletctro extends Pedido{
  private String descricao;

    public PedidoEletctro(double valor) {
        super(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
