package br.com.digitalinnovationone.API;

import java.util.function.Consumer;

public class consumidores {
    public static void main(String[] args){

        Consumer<String> imprimirUmaFrase = System.out::println;

   //     Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
