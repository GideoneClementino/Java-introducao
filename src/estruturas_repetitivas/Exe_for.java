package exercicios;

import java.util.Scanner;

public class Exe_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número");
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);				
			}
			
		}				
		sc.close();
	}

}
