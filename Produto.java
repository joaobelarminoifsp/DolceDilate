public class Produto {
    private String nome;
    private int quantidadeProduto;
    private double precoProduto;

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setQuantidadeProduto(int qtd) {
        this.quantidadeProduto += qtd;
    }

    public int getQuantidadeProduto() {
        return this.quantidadeProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
