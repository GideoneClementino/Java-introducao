package poo1;

import exercicio_polimorfismo.Produto;
import exercicio_polimorfismo.Produto_importado;
import exercicio_polimorfismo.Produto_usado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa_polimorfismo2 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o numero de produtos: ");
        int n_produtos = scanner.nextInt();

        for (int i = 1; i <= n_produtos; i++){

            System.out.println("Dados do produto #" + i);
            char p;
            do {
                System.out.print("Comum, usado ou importado? (c/u/i) ");
                p = scanner.next().charAt(0);
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();

                if (p == 'c'){
                    Produto produto = new Produto(nome, preco);
                    lista.add(produto);
                } else if (p == 'u'){
                    scanner.nextLine();
                    System.out.print("Data: ");
                    Date data = sdf.parse(scanner.nextLine());
                    Produto produto = new Produto_usado(nome, preco, data);
                    lista.add(produto);
                } else if (p == 'i'){
                    System.out.print("Taxa de importação: ");
                    double taxa = scanner.nextDouble();

                    Produto produto = new Produto_importado(nome, preco, taxa);
                    lista.add(produto);
                }else {
                    System.out.println("Informação tipo do produto incorreta digite novamente");
                }
            } while (p != 'c' && p != 'u' && p != 'i');
        }
        System.out.println("Tag dos produtos:");
        for (Produto p : lista){
            System.out.println(p);
        }
        scanner.close();
    }
}
