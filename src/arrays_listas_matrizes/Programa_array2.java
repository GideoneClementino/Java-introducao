package arrays_listas_matrizes;

import objetos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa_array2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++){
            scan.nextLine();
            String nome = scan.nextLine();
            double preco = scan.nextDouble();
            int quantidade = scan.nextInt();
            vetor[i] = new Produto(nome, preco, quantidade);
        }
        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPreco();
        }
        double media = soma / vetor.length;
        System.out.printf("Media do preço: %.2f\n", media);
    }
}
