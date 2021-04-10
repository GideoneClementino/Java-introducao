package objetos;

import enums.Nivel_do_trabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private Nivel_do_trabalhador nivel;
    private Double salario_base;

    private Departamento departamento;
    private List<Contrato_por_hora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, Nivel_do_trabalhador nivel, Double salario_base, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salario_base = salario_base;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel_do_trabalhador getNivel() {
        return nivel;
    }

    public void setNivel(Nivel_do_trabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contrato_por_hora> getContratos() {
        return contratos;
    }

    public void adicionar_contrato(Contrato_por_hora contrato){
        contratos.add(contrato);
    }

    public void remove_contrato(Contrato_por_hora contrato){
        contratos.remove(contrato);
    }

    public double calcula_ganhos(int ano, int mes){
        double soma = salario_base;
        Calendar calendario = Calendar.getInstance();

        for (Contrato_por_hora c : contratos) {
            calendario.setTime(c.getData());
            int c_ano = calendario.get(Calendar.YEAR);
            //1 somado pois o mes do calendar começa com zero
            int c_mes = 1 + calendario.get(Calendar.MONTH);

            if (ano == c_ano && mes == c_mes){
                soma += c.valor_total();
            }
        }
        return soma;
    }
}
