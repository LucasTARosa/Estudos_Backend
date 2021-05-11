package Aula.listasSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
    LinkedHashSet<Integer> sequenciaNumero = new LinkedHashSet<>();

    //add sequencia de números
        sequenciaNumero.add(1);
        sequenciaNumero.add(2);
        sequenciaNumero.add(4);
        sequenciaNumero.add(8);
        sequenciaNumero.add(16);

        System.out.println(sequenciaNumero);

        //remove o número do set
        sequenciaNumero.remove(4);
        System.out.println(sequenciaNumero);

        //retorna a quantidade de itens do set
        System.out.println(sequenciaNumero.size());

        //navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumero.iterator();
        while (iterator.hasNext()){
            System.out.println("> " +iterator.next());
        }
        for (Integer numero: sequenciaNumero) {
            System.out.println("--> " + numero);
        }
            //retorna se o set está vazio ou não
            System.out.println(sequenciaNumero.isEmpty());



    }
}
