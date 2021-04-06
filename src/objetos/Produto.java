package objetos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    /*Utilizando a reescrita podemos criar varios construtores com menos ou mais parametros
     e utiliza-los para varios tipos de metodos ou classes*/
    public Produto(){
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    /*Apenas o metodo get será implementado para que a quantidade do produto seja alterada apenas
    pelos metodos de entrada e saida no estoque, protegendo o programa de qualquer alteração inapropriada*/
    public int getQuantidade(){
        return quantidade;
    }

    public double valorTotalNoEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $ "
                + String.format("%.2f", valorTotalNoEstoque());
    }
}
