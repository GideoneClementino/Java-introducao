package poo1;

import objetos.Conta_bancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa_conta_bancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double saldo = 0;
        double deposito;
        double saque;
        char opcao;

        System.out.print("Digita o número da conta: ");
        int numero_conta = scan.nextInt();
        scan.nextLine();
        System.out.print("Nome do titular: ");
        String nome_titular = scan.nextLine();

        Conta_bancaria conta = new Conta_bancaria(numero_conta, nome_titular, saldo);

        do {
            System.out.println("Deseja fazer um deposito inicial? (s/n)? ");
            opcao = scan.next().charAt(0);
            if (opcao == 's'){
                System.out.print("Digite o valor do deposito inicial:");
                saldo = scan.nextDouble();
                conta.deposito(saldo);
                conta.dados_conta();
            } else if(opcao == 'n'){
                System.out.println("Dados da conta:");
                conta.dados_conta();
            }else {
                System.out.println("Resposta incorreta");
            }
        } while (opcao != 's' && opcao != 'n');

        System.out.print("Digite o valor do deposito: ");
        deposito = scan.nextDouble();
        conta.deposito(deposito);
        conta.dados_conta();

        System.out.print("Digite o valor do saque: ");
        saque = scan.nextDouble();
        conta.saque(saque);
        conta.dados_conta();
        scan.close();
    }
}
