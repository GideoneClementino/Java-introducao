package poo1;

import java.util.Locale;
import java.util.Scanner;

import objetos.Calculadora;

public class Programa_calculadora {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.circunferencia(raio);
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferência: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Valor PI: %.2f\n", Calculadora.PI);
		
		sc.close();
	}
}
