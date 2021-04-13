package exercicio_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_usado extends Produto{
    private Date data;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Produto_usado() {
        super();
    }

    public Produto_usado(String nome, Double preco, Date data) {
        super(nome, preco);
        this.data = data;
    }

    @Override
    public String toString(){
        return super.toString() + " (Data: " + sdf.format(data) + ")";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
