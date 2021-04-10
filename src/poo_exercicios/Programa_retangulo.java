package poo_exercicios;

import java.util.Locale;
import java.util.Scanner;

import objetos_exercicios.Retangulo;

public class Programa_retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a largura e altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		System.out.printf("�rea: %.2f\n", retangulo.area());
		System.out.printf("Perimetro: %.2f\n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f\n", retangulo.diagonal()); 
	}

}
