package estruturaSequencial;

import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		int n;
		double d;
		char c;
		
		System.out.print("Digite uma palavra: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.print("Digite um n�mero inteiro: ");	
		n = sc.nextInt();
		System.out.println("Você digitou: " + n);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.print("Digite um n�mero double: ");	
		d = sc.nextDouble();
		System.out.println("Você digitou: " + d);
		              
		System.out.println("------------------------------------------------------------");
		
		System.out.print("Digite um caractere: ");
		//charAt para pegar a primeira letra
		c = sc.next().charAt(0);
		System.out.println("Você digitou: " + c);
		
		sc.close();
	}

}
