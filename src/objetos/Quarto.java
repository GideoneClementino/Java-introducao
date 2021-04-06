package objetos;

public class Quarto {
    int numero_quarto;
    double aluguel;
    String nome;
    String email;

    public Quarto(int numero_quarto, String nome, String email) {
        aluguel = 40;
        this.numero_quarto = numero_quarto;
        this.nome = nome;
        this.email = email;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
