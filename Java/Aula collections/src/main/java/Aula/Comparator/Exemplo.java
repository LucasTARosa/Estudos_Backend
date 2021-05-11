package Aula.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Exemplo {
    public static void main(String[] args){

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Lucas", 27));
        estudantes.add(new Estudante("Luana", 33));
        estudantes.add(new Estudante("Maria", 21));
        estudantes.add(new Estudante("Letícia", 28));
        estudantes.add(new Estudante("Thiago", 18));

        //ordem natural que a lista foi criada
        System.out.println("--- ordem de iserção ---");
        System.out.println(estudantes);

        //tinha o método sort, mas n consegui usar (me faltou sort...hã, hã?)
        //consegui executar o método sort, neste caso na ordem natural
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudantes);


        //e neste caso na ordem reversa
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        //ordena na ordem natural dos numeros (do menor para o maior)
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("--- ordem natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        //ordena na ordem inversa os numeros (do maior para o menor
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- Ordem reversa dos números - idade (method reference ---");
        System.out.println(estudantes);

        //outra forma de ordenar na ordem natural dos números
        Collections.sort(estudantes);
        System.out.println("--- ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        //outra forma de ordenar na ordem inversa dos números
        Collections .sort(estudantes, new interfaceComparator());
        System.out.println("--- ordem reversa dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

    }
}
