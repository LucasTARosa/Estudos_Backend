package br.com.digitalinnovationone.API;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteracoesAPI {
    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Luana", "Rafael", "Eduardo"};
        Integer[] numeros = {1, 2, 3, 4};
       // imprimirNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes);
        imprimirODobroCadaItem(numeros);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Lucas")) {
                nomesParaImprimir += " " + nomes[i];
            }
        }

        System.out.println("Nomes para imprimir pelo for: "+nomesParaImprimir);

        String nomesParaImpressaoApi = Stream.of(nomes)
                .filter(nome -> nome.equals("Lucas"))
                .collect(Collectors
                        .joining());

        System.out.println("Nomes para imprimir pelo Stream: " +nomesParaImpressaoApi);
    }

    public static void imprimirTodosNomes(String... nomes){
        for (String nome : nomes){
            System.out.println("Imprimir pelo for: "+nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: "+nome));

    }


    public static void imprimirODobroCadaItem(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println(numero*2);
        }

        Stream.of(numeros).map(numero -> numero*2).forEach(System.out::println);
    }

}
