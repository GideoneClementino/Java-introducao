package poo1;

import heranca.Funcionario;
import heranca.Funcionario_terceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa_heranca3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Digite o número de funcionarios: ");
        int num_funcionario = scanner.nextInt();

        for (int i = 1; i <= num_funcionario; i++){
            System.out.println("Dados do funcionario #" + i);
            char t;
            do {
                System.out.print("É terceirizado? (s/n)");
                t = scanner.next().charAt(0);
                scanner.nextLine();

                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Horas: ");
                int horas = scanner.nextInt();
                System.out.print("Valor por hora: ");
                double valor_hora = scanner.nextDouble();

                if (t == 'n'){
                    Funcionario func = new Funcionario(nome, horas, valor_hora);
                    func.pagamento();
                    funcionarios.add(func);
                }else if (t == 's'){
                    System.out.print("Bonus: ");
                    double bonus = scanner.nextDouble();
                    Funcionario func = new Funcionario_terceirizado(nome, horas, valor_hora, bonus);
                    func.pagamento();
                    funcionarios.add(func);
                }else {
                    System.out.println("Resposta incorreta digite novamente");
                }
            }while (t != 's' && t != 'n');
            System.out.println();
        }
        System.out.println("PAGAMENTOS");
        for (Funcionario p : funcionarios){
            System.out.println(p);
        }
        scanner.close();
    }
}
