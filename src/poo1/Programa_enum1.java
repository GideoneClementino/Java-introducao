package poo1;

import enums.Status_do_pedido;
import java.util.Date;

public class Programa_enum1 {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), Status_do_pedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        Status_do_pedido status_do_pedido1 = Status_do_pedido.ENTREGUE;

        //Convertendo enum para String
        Status_do_pedido status_do_pedido2 = Status_do_pedido.valueOf("ENTREGUE");

        System.out.println(status_do_pedido1);
        System.out.println(status_do_pedido2);
    }
}
