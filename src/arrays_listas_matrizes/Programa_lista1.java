package arrays_listas_matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa_lista1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add("Gideone");
        lista.add("Ester");
        lista.add("Anderson");
        lista.add(2, "Marco");

        System.out.println(lista.size());

        for(String x : lista){
            System.out.println(x);
        }
        System.out.println("----------------------------------");
        lista.remove(1);
        //Função lambda, removendo nomes que começam com 'M'
        lista.removeIf(x -> x.charAt(0) == 'M');

        for (String x : lista){
            System.out.println(x);
        }

        System.out.println("----------------------------------");
        //Mostrando indice de uma variavel no arraylist
        System.out.println("Indice do gideone: " + lista.indexOf("Gideone"));
        System.out.println("----------------------------------");

        //Filtrando lista para receber nomes que começam com 'A'
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : resultado){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        //Funcao lambda para encontrar primeiro nome começando com 'A'
        String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
    }
}
