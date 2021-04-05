package poo1;

import java.util.Locale;
import java.util.Scanner;

import objetos.Funcionario;

public class Programa_funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Funcionário: %s, $ %.2f\n", funcionario.nome, funcionario.salarioLiquido());
		
		System.out.println();
		System.out.print("Qual porcentagem será o aumento? ");
		double porcentagem = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Dados atualizados: %s, $ %.2f\n", funcionario.nome, funcionario.aumento(porcentagem));
	}

}
