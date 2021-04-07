package arrays_listas_matrizes;

import objetos.Aluno;
import objetos.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Programa_array3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int numero_quarto;
        String[] aluguel = new String[9];

        System.out.print("Digite a quantidade de alunos: ");
        int quant_alunos = scan.nextInt();

        //Instanciando vetores dos objetos
        Aluno[] vetor_aluno = new Aluno[quant_alunos];
        Quarto[] vetor_quarto = new Quarto[9];
        scan.nextLine();

        for (int i = 0; i < quant_alunos; i++) {
            n += 1;
            System.out.println("Quarto #" + n + ":");
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Numero do quarto: ");
            numero_quarto = scan.nextInt();
            scan.nextLine();

            vetor_quarto[i] = new Quarto(numero_quarto);
            vetor_aluno[i] = new Aluno(nome, email);

            aluguel[numero_quarto] = vetor_quarto[i].getNumero_quarto() + ": " + vetor_aluno[i].getNome() + ", " +
                    vetor_aluno[i].getEmail();
        }

        System.out.println();
        System.out.println("Quartos ocupados:");

        for (int i = 0; i < vetor_quarto.length; i++) {
            if (aluguel[i] == null) {
            } else {
                System.out.println(aluguel[i]);
            }
        }
        scan.close();
    }
}
