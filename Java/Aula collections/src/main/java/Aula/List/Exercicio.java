package Aula.List;
import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;

public class Exercicio {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        String nome1 = nomes.get(0);
        String nome2 = nomes.get(1);
        String nome3 = nomes.get(2);
        String nome4 = nomes.get(3);
        String nome5 = nomes.get(4);
        System.out.println(nomes);
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome3);
        System.out.println(nome4);
        System.out.println(nome5);

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        String nome11 = nomes.get(1);
        System.out.println(nome11);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        List nomes2 = new ArrayList();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        System.out.println(nomes2);
        Collections.sort(nomes2);
        System.out.println(nomes2);

        boolean listaVazia = nomes2.isEmpty();
        System.out.println(listaVazia);

        System.out.println(nomes);
        nomes.addAll(nomes2);
        System.out.println(nomes);

    }
}
