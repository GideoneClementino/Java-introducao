package poo1;

import heranca.Conta;
import heranca.Conta_empresa;
import heranca.Conta_poupanca;

public class Programa_heranca2 {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1001, "Alex", 1000.0);
        conta1.saque(200.0);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new Conta_poupanca(1002, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new Conta_empresa(1003, "Bob", 1000.0, 500.0);

        conta3.saque(200.00);
        System.out.println(conta3.getSaldo());
    }
}
