package heranca;

import heranca.Conta;

public class Conta_empresa extends Conta {
    private Double limite_emprestimo;

    public Conta_empresa() {
        super();
    }

    public Conta_empresa(Integer numero, String titular, Double saldo, Double limite_emprestimo) {
        super(numero, titular, saldo);
        this.limite_emprestimo = limite_emprestimo;
    }

    public void emprestimo(Double valor) {
        if (valor <= limite_emprestimo) {
            saldo += valor - 10;
        }
    }

    @Override
    public void saque(double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }

    public Double getLimite_emprestimo() {
        return limite_emprestimo;
    }

    public void setLimite_emprestimo(Double limite_emprestimo) {
        this.limite_emprestimo = limite_emprestimo;
    }
}
