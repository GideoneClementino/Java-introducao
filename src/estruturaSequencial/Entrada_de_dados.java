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
		System.out.println("Voc� digitou: " + x);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.print("Digite um n�mero inteiro: ");	
		n = sc.nextInt();
		System.out.println("Voc� digitou: " + n);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.print("Digite um n�mero double: ");	
		d = sc.nextDouble();
		System.out.println("Voc� digitou: " + d);
		              
		System.out.println("------------------------------------------------------------");
		
		System.out.print("Digite um caractere: ");
		//charAt para pegar a primeira letra
		c = sc.next().charAt(0);
		System.out.println("Voc� digitou: " + c);
		
		sc.close();
	}

}
