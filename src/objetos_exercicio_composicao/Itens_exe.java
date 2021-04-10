package objetos_exercicio_composicao;

public class Itens_exe {
    private Integer quantidade;
    private Double preco;
    private Produto_exe produto;

    public Itens_exe() {
    }

    public Itens_exe(Integer quantidade, Double preco, Produto_exe produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public double sub_total(){
        return quantidade * preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto_exe getProduto() {
        return produto;
    }

    public void setProduto(Produto_exe produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getProduto().getNome() + ", $");
        sb.append(String.format("%.2f", getProduto().getPreco()));
        sb.append(", ");
        sb.append("Quantidade: ");
        sb.append(getQuantidade());
        sb.append(", Subtotal: ");
        sb.append(String.format("%.2f", sub_total()));
        return sb.toString();
    }
}
