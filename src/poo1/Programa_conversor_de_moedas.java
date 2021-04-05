package poo1;

import java.util.Locale;
import java.util.Scanner;

import objetos.Conversor_de_moedas;

public class Programa_conversor_de_moedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço do dolar: ");
		double dolar = sc.nextDouble();
		System.out.println("Digite quanto irá converter: ");
		double valor = sc.nextDouble();
		
		double total = Conversor_de_moedas.conversor(valor, dolar);
		
		System.out.printf("Total a pagar em reais: %.2f\n", total);
	}

}
