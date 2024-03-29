package exercicio_composicao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente_exe {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String nome;
    private String email;
    private Date data_nascimento;


    public Cliente_exe() {
    }

    public Cliente_exe(String nome, String email, Date data_nascimento) {
        this.nome = nome;
        this.email = email;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return nome + " (" + sdf.format(data_nascimento) + ") - " + email;
    }
}
