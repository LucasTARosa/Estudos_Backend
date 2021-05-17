package br.com.digitalinnovationone.ParallelStream;

import java.util.stream.IntStream;

public class Parallel {
    public static void main(String[] args){
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(num -> System.out.println(fatorial(num)));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução :: "+(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel ::"+(fim-inicio));
    }



    public static long fatorial(long num){
        long fat = 2;

        for(long i = 2; i <- num; i++){
            fat *= i;
        }
        return fat;
    }
}
