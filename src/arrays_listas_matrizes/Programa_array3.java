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

        System.out.print("Digite a quantidade de alunos: ");
        int quant_alunos = scan.nextInt();
        //Instanciando vetores dos objetos
        Aluno[] vetor_aluno = new Aluno[quant_alunos];
        Quarto[] vetor_quarto = new Quarto[9];
        scan.nextLine();

        for (int i = 0; i < vetor_aluno.length; i++){
            n += 1;
            System.out.println("Quarto #" + n);
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Numero do quarto: ");
            numero_quarto = scan.nextInt();
            scan.nextLine();

            vetor_aluno[i] = new Aluno(nome, email);
            vetor_quarto[i] = new Quarto(numero_quarto);
        }
        System.out.println("Quartos ocupados:");

        for (int i = 0; i < vetor_aluno.length; i++){
            System.out.println(vetor_quarto[i].getNumero_quarto() + ": " + vetor_aluno[i].getNome() + ", " +
                    vetor_aluno[i].getEmail());
        }
    }
}
