package Aula.listasSet;

import java.util.TreeSet;

public class Exercicio {
    public static void  main(String[] args){
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //exibindo os numeros no console
        System.out.println(numeros);

        //removendo o primeiro item do set
        numeros.pollFirst();
        System.out.println(numeros);

        //adicionando o numero 23
        numeros.add(23);
        System.out.println(numeros);

        //verificando o tamanho do set
        System.out.println(numeros.size());

        //verificando se o set está vazio
        System.out.println(numeros.isEmpty());
    }
}
