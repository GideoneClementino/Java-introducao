package polimorfismo;

public class Funcionario_terceirizado extends Funcionario{
    private Double bonus;

    public Funcionario_terceirizado() {
        super();
    }

    public Funcionario_terceirizado(String nome, Integer horas, double valor_hora, Double bonus) {
        super(nome, horas, valor_hora);
        this.bonus = bonus;
    }

    @Override
    public double pagamento(){
        super.pagamento();
        valor_hora += bonus * 110 / 100;
        return valor_hora;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus: " + String.format("%.2f", bonus);
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
