package poo1;

import heranca.Conta;
import heranca.Conta_empresa;
import heranca.Conta_poupanca;

public class Programa_heranca1 {
    public static void main(String[] args) {
        Conta conta = new Conta(1001, "Alex", 0.0);
        Conta_empresa conta_empresa = new Conta_empresa(1002, "Maria", 0.0, 500.00);

        //UPCASTING
        Conta conta1 = conta_empresa;
        Conta conta2 = new Conta_empresa(1003, "Bob", 0.0, 200.00);
        Conta conta3 = new Conta_poupanca(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING
        Conta_empresa conta4 = (Conta_empresa) conta2;
        conta4.emprestimo(100.0);
        /*Verificando se o objeto é instancia da conta empresa, no caso nao é o compilador ira pular para condição
        de baixo*/
        if (conta3 instanceof Conta_empresa) {
            Conta_empresa conta5 = (Conta_empresa) conta3;
            conta5.emprestimo(200.0);
            System.out.println("Emprestimo");
        } else if (conta3 instanceof Conta_poupanca) {
            Conta_poupanca conta5 = (Conta_poupanca) conta3;
            conta5.atualiza_saldo();
            System.out.println("Saldo atualizado");
        }
    }
}
