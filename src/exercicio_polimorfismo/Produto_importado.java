package exercicio_polimorfismo;

public class Produto_importado extends Produto {
    private Double taxa;

    public Produto_importado() {
        super();
    }

    public Produto_importado(String nome, Double preco, Double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double preco_total() {
        return preco += taxa;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " $" + String.format("%.2f", preco_total()) + " (Taxa de importação: $"
                + String.format("%.2f", taxa) + ")";
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
