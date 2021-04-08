package arrays_listas_matrizes;

import java.util.Scanner;

public class Program_matriz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++){
            System.out.println(matriz[i][i] + " ");
        }
        System.out.println();

        int cont = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    cont++;
                }
            }
        }
        System.out.print("Quantidade de numeros negativos: " + cont);
        scan.close();
    }
}
