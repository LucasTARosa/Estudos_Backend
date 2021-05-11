package Aula.listasSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
    public static void main(String[] args){
        Set<Double> notasAlunos = new HashSet<>();

        //adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(7.9);
        notasAlunos.add(1.4);
        notasAlunos.add(10.0);
        notasAlunos.add(9.4);
        notasAlunos.add(5.9);
        notasAlunos.add(8.5);

        System.out.println(notasAlunos);

        //remove a nota do set
        notasAlunos.remove(1.4);
        System.out.println(notasAlunos);

        //retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        //naveta em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println("> " +iterator.next());
        }
        for (Double nota: notasAlunos){
            System.out.println(nota);
        }
        System.out.println(notasAlunos);
        System.out.println(notasAlunos.isEmpty());
        notasAlunos.clear();
        System.out.println(notasAlunos);
        System.out.println(notasAlunos.isEmpty());

    }
}
