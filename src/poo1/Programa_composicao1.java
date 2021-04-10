package poo1;

import enums.Nivel_do_trabalhador;
import objetos.Contrato_por_hora;
import objetos.Departamento;
import objetos.Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa_composicao1 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nome_departamento = scanner.nextLine();
        System.out.println("Digite os dados do trabalhador: ");
        System.out.print("Nome: ");
        String trabalhador_nome = scanner.nextLine();
        System.out.print("Nivel do trabalhador: ");
        String trabalhador_nivel = scanner.nextLine();
        System.out.print("Salario base: ");

        double trabalhador_salario = scanner.nextDouble();
        Trabalhador trabalhador = new Trabalhador(trabalhador_nome, Nivel_do_trabalhador.valueOf(trabalhador_nivel),
                trabalhador_salario, new Departamento(nome_departamento));

        System.out.print("Quantos contratos o trabalhador tera: ");
        int n_contratos = scanner.nextInt();

        for (int i = 1; i <= n_contratos; i++) {
            System.out.println("Digite os dados do contrato #" + i);

            System.out.print("Data (DD/MM/YYYY): ");
            Date data_contrato = sdf.parse(scanner.next());
            System.out.print("Valor por hora: ");
            double valor_por_hora = scanner.nextDouble();
            System.out.print("Duracao (horas): ");
            int horas = scanner.nextInt();

            Contrato_por_hora contrato = new Contrato_por_hora(data_contrato, valor_por_hora, horas);
            trabalhador.adicionar_contrato(contrato);
        }

        System.out.println("");
        System.out.print("Digite o mes e ano para calcular o salario (MM/YYYY): ");
        String mes_e_ano = scanner.next();
        int mes = Integer.parseInt(mes_e_ano.substring(0, 2));
        int ano = Integer.parseInt(mes_e_ano.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Ganhos do mes " + mes_e_ano + ": " + String.format("%.2f",
                trabalhador.calcula_ganhos(ano, mes)));

        scanner.close();
    }
}
