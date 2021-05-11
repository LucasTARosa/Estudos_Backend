package Aula.List;

import java.util.*;

public class aula {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Amanda");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(1);
        System.out.println(nomes);

        nomes.remove("Maria");
        System.out.println(nomes);

        String blublu = nomes.get(2);
        System.out.println(blublu);

        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao);
        int posicao2 = nomes.indexOf("Lucas");
        System.out.println(posicao2);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temjoao = nomes.contains("João");
        System.out.println(temjoao);
        boolean temfernando = nomes.contains("Fernando");
        System.out.println(temfernando);

        for (String nomeDoItem: nomes){
            System.out.println("--> " +nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("----> " +iterator.next());
        }
        System.out.println(iterator);

        boolean listavazia = nomes.isEmpty();
        System.out.println(listavazia);
        nomes.clear();
        boolean listavazia2 = nomes.isEmpty();
        System.out.println(listavazia2);


    }
}
