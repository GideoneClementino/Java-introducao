package poo1;

import java.util.Locale;
import java.util.Scanner;

import objetos.Aluno;

public class Programa_aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Digite a primeira nota: ");
		aluno.primeiraNota = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		aluno.segundaNota = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		aluno.terceiraNota = sc.nextDouble();
		
		System.out.println("Resultado: " + aluno.toString());
		sc.close();
	}
}
