package composicao;

import java.util.Date;

public class Contrato_por_hora {

    private Date data;
    private Double valor_por_hora;
    private Integer horas;

    public Contrato_por_hora() {
    }

    public Contrato_por_hora(Date data, Double valor_por_hora, Integer horas) {
        this.data = data;
        this.valor_por_hora = valor_por_hora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor_por_hora() {
        return valor_por_hora;
    }

    public void setValor_por_hora(Double valor_por_hora) {
        this.valor_por_hora = valor_por_hora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valor_total(){
        return valor_por_hora * horas;
    }
}
