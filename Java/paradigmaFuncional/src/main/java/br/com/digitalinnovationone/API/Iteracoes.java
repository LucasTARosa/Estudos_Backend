package br.com.digitalinnovationone.API;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

public class Iteracoes {
    public static void main(String[] args){
        String[] nomes = {"Lucas", "Luana", "Rafael", "Eduardo"};
        Integer [] numeros = {1, 2, 3, 4};
        imprimirNomesFiltrados(nomes);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream().filter(profissao -> profissao
                .startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length ; i++){
            if (nomes[i].equals("Lucas")){
                nomesParaImprimir += nomes[i];
            }
        }
        System.out.println(nomesParaImprimir);
    }
}
