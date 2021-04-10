package objetos_exercicios;

public class Itens_exe {
    Integer quantidade;
    Double preco;
    Produto_exe produto;

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
}
