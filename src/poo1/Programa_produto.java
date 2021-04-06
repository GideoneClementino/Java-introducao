package poo1;

import java.util.Locale;
import java.util.Scanner;

import objetos.Produto;

public class Programa_produto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Produto produto = new Produto(nome, preco);
        //Testando setter nome
        produto.setNome("Computador");
        System.out.println("Nome atualizado: " + produto.getNome());
        //Testando getter preço
        produto.setPreco(1200.00);
        System.out.println("Preço atualizado: " + produto.getPreco());

        System.out.println();
        System.out.print("Dados do produto: " + produto.toString());

        System.out.println();
        System.out.print("Digite o número de produtos para adicionar no estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.print("Dados atualizados: " + produto.toString());

        System.out.println();
        System.out.print("Digite o número de produtos para remover do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.print("Dados atualizados: " + produto.toString());
        sc.close();
    }

}
