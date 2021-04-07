package arrays_listas_matrizes;

import objetos.Funcionario_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa_lista2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario_lista> lista = new ArrayList<>();

        System.out.print("Quantos funcionarios deseja registrar? ");
        int numero_funcionarios = sc.nextInt();

        for (int i = 0; i < numero_funcionarios; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();

            while (busca_id(lista, id)) {
                System.out.println("Id indisponivel! Tente denovo: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Funcionario_lista funcionario = new Funcionario_lista(id, nome, salario);
            lista.add(funcionario);
        }

        System.out.println();
        System.out.print("Digite o ID do funcionario que recebera aumento: ");
        int id_salario = sc.nextInt();

        Integer busca = busca_posicao(lista, id_salario);
        //Metodo alternativo para buscar o id na lista utilizando lambda
        //Funcionario_lista func = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (busca == null) {
            //if (func == null) {
            System.out.println("Esse ID não existe");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            lista.get(busca).aumento(porcentagem);
            //func.aumento(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (Funcionario_lista funcionario : lista) {
            System.out.println(funcionario);
        }
        sc.close();
    }

    //Buscando posicao do id
    public static Integer busca_posicao(List<Funcionario_lista> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    //Verificando se o id existe
    public static boolean busca_id(List<Funcionario_lista> list, int id) {
        Funcionario_lista funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}