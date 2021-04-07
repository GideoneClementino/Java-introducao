package objetos;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public double aumento(double porcentagem) {
        return (salarioBruto * porcentagem) / 100 + salarioLiquido();
    }

}
