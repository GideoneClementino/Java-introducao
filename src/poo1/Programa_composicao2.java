package poo1;

import objetos.Comentario;
import objetos.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa_composicao2 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem!");
        Comentario c2 = new Comentario("Wow isso é incrivel!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia",
                "Vou visitar esse pais maravilhoso!", 12);

        p1.adicionar_comentario(c1);
        p1.adicionar_comentario(c2);

        Comentario c3 = new Comentario("Boa noite");
        Comentario c4 = new Comentario("Que a força esteja com voce");

        Post p2 = new Post(sdf.parse("28/08/2018 23:14:19"), "Boa noite gente",
                "Vejo voces amanhã", 5);

        p2.adicionar_comentario(c3);
        p2.adicionar_comentario(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
