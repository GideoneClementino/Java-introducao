package estruturas_repetitivas;

public class For_each {
    public static void main(String[] args) {
        String[] vetor = new String[] {"Maria", "Bob", "Alux"};

        for (String nomes : vetor){
            System.out.println(nomes);
        }
    }
}
