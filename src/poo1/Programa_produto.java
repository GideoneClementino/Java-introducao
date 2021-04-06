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
        System.out.println("Quantidade no estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println();

        System.out.println("Dados do produto: " + produto.toString());

        System.out.println();
        System.out.println("Digite o número de produtos para adicionar no estoque: ");
        quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto.toString());

        System.out.println();
        System.out.println("Digite o número de produtos para remover do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto.toString());

        sc.close();
    }

}
