import java.util.ArrayList;

public class Venda {
    private double totalVenda;
    private double precoEntrega;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int qtdProdutos;

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos() {
        int qtd = 0;
        for(Produto produto : produtos)
            qtd += produto.getQuantidadeProduto();

        this.qtdProdutos += qtd;
    }

    public double getPrecoEntrega() {
        return precoEntrega;
    }

    public void setPrecoEntrega(double precoEntrega) {
        this.precoEntrega = precoEntrega;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda() {
        double totalProdutos = 0;
        for(Produto produto : produtos)
            totalProdutos =+ produto.getPrecoProduto();

        this.totalVenda = this.getPrecoEntrega() + totalProdutos;
    }
}
