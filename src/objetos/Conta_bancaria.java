package objetos;

public class Conta_bancaria {
    private int numero_conta;
    private String nome_titular;
    private double saldo;

    public Conta_bancaria(int numero_conta, String nome_titular, double saldo) {
        this.numero_conta = numero_conta;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }

    public double deposito(double valor){
        return saldo += valor;
    }

    public double saque(double valor){
        saldo -= valor;
        return saldo -= 5;
    }

    public void dados_conta(){
        System.out.printf("Conta %d, Titular: %s, Saldo: %.2f\n", numero_conta, nome_titular, saldo);
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
