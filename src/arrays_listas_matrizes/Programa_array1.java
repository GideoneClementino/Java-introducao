package arrays_listas_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Programa_array1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double[] vetor = new  double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite o numero: ");
            vetor[i] = scan.nextDouble();
        }

        double soma = 0;
        for (int i = 0;i < n; i++){
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.printf("Média: %.2f\n", media);
    }
}
