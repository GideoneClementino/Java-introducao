package heranca;

public class Conta_poupanca extends Conta{
    private Double taxa_juros;

    public Conta_poupanca() {
        super();
    }

    public Conta_poupanca(Integer numero, String titular, Double saldo, Double taxa_juros) {
        super(numero, titular, saldo);
        this.taxa_juros = taxa_juros;
    }

    public void atualiza_saldo(){
        saldo += saldo * taxa_juros;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }

    public Double getTaxa_juros() {
        return taxa_juros;
    }

    public void setTaxa_juros(Double taxa_juros) {
        this.taxa_juros = taxa_juros;
    }
}
