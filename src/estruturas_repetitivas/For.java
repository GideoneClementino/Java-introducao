package estruturas_repetitivas;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros somar:");
		int n = sc.nextInt();		
		int soma = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println("Resultado: " + soma);
		sc.close();
	}

}
