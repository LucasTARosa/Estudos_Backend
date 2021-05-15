package br.com.digitalinnovationone.API;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args){
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("Leticia"));
        System.out.println(converterStringParaInteiro.apply("20"));
    }
}
