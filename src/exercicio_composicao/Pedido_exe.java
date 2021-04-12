package exercicio_composicao;

import enums.Status_do_pedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido_exe {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private Status_do_pedido status;
    //Relacionando cliente a lista
    private Cliente_exe cliente;
    //Instanciando itens ao pedido
    private List<Itens_exe> itens = new ArrayList<>();

    public Pedido_exe() {
    }

    public Pedido_exe(Date momento, Status_do_pedido status, Cliente_exe cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public void adiciona_item(Itens_exe item) {
        itens.add(item);
    }

    public void remove_item(Itens_exe item){
        itens.remove(item);
    }

    public double total(){
        double total = 0;
        for (Itens_exe i : itens){
            total += i.sub_total();
        }
        return total;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Status_do_pedido getStatus() {
        return status;
    }

    public void setStatus(Status_do_pedido status) {
        this.status = status;
    }

    public Cliente_exe getCliente() {
        return cliente;
    }

    public void setCliente(Cliente_exe cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Horario do pedido ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        for (Itens_exe i : itens){
            sb.append(i + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
