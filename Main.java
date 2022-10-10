package Facade;

public class Main {
    public static void main(String[] args) {
        Cartao cartao = new Cartao("15git 34567890", "Star Bank");
        Produto produto = new Produto("Ervilhas", "Pacote");


        ApiCartao apiCartao = new ApiCartao();
        ApiProduto apiProduto = new ApiProduto();
        ApiQuantidade apiQuantidade = new ApiQuantidade();
        int desconto = apiCartao.desconto(cartao) + apiProduto.desconto(produto) + apiQuantidade.desconto(15);
        System.out.println(desconto);


        FacadeDesconto facadeDesconto = new FacadeDesconto();
        desconto = facadeDesconto.calcularDesconto(cartao, produto, 15);
        System.out.println(desconto);
    }
}
