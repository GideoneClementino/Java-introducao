package poo_exercicios;

import enums.Status_do_pedido;
import objetos_exercicios.Cliente_exe;
import objetos_exercicios.Itens_exe;
import objetos_exercicios.Pedido_exe;
import objetos_exercicios.Produto_exe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa_exe_pedido {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date hora_atual = new Date();

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date data_nascimento = sdf1.parse(scanner.next());

        System.out.println();
        scanner.nextLine();
        System.out.println("Digite os dados do pedido: ");
        System.out.print("Status: ");
        String status_pedido = scanner.nextLine();
        System.out.print("Quantos itens para esse pedido? ");
        int quant_itens = scanner.nextInt();

        Pedido_exe pedido = new Pedido_exe(sdf2.parse(sdf2.format(hora_atual)),
                Status_do_pedido.valueOf(status_pedido), new Cliente_exe(nome, email, data_nascimento));

        for (int i = 1; i <= quant_itens; i++){
            scanner.nextLine();
            System.out.println("Digite os dados do #" + i + " item: ");
            System.out.print("Nome do produto: ");
            String nome_produto = scanner.nextLine();
            System.out.print("Digite o preço do item: ");
            double preco_produto = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quant_produto = scanner.nextInt();

            Produto_exe produto = new Produto_exe(nome_produto, preco_produto);
            Itens_exe itens = new Itens_exe(quant_produto, produto.getPreco(), produto);
            pedido.adiciona_item(itens);
        }

        System.out.println();
        System.out.println("DADOS DO PEDIDO:");
        System.out.println("Horario do pedido: " + sdf2.format(pedido.getMomento()));
        System.out.println("Status do pedido: " + pedido.getStatus());
        System.out.println("Cliente: " + pedido.getCliente().toString());

        System.out.println();
        System.out.println("Itens pedidos:");
        System.out.println(pedido);
        System.out.printf("Preço total: %.2f", pedido.total());
    }
}
