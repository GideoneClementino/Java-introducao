package objetos;

public class Quarto {
    int numero_quarto;
    double aluguel;

    public Quarto(int numero_quarto) {
        aluguel = 40;
        this.numero_quarto = numero_quarto;
    }

    public int getNumero_quarto() {
        return numero_quarto;
    }

    public void setNumero_quarto(int numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public double getAluguel() {
        return aluguel;
    }
}
