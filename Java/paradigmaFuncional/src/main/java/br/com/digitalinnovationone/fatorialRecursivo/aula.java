package br.com.digitalinnovationone.fatorialRecursivo;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class aula {

    public static void main(String[] args){
        int valor = 10;
        int resultado = valor * 3;
        System.out.print("O resultado é: "+resultado +"\n");

        //apresentando o conceito do paradigma funcional
        UnaryOperator<Integer> calcularValorVezesTrinta = valor2 -> valor2*3;
        int valor2 = 11;
        System.out.println("O resultado é-> "+calcularValorVezesTrinta.apply(10));

        //forma funcional
        int[] valores = {1, 2, 3, 4};
        Arrays.stream(valores)
                .filter(numero -> numero %2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

        //forma imperativa
        for (int i = 0; i < valores.length ; i++){
            int valor3 = 0;
            if (valores[i] %2 == 0){
                valor3 = valores[i] * 2;
                if (valor != 0){
                    System.out.println(valor3);
                }
            }
        }

        //sempre retorna a mesma resposta, quando se entra com as mesmas variáveis
        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(13, 12));
        System.out.println(verificarSeEMaior.test(12, 13));
        System.out.println(verificarSeEMaior.test(13, 12));

        //imutabilidade: uma variável NUNCA poderá ser alterada
        int valor5 = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println(retornarDobro.apply(valor5));//retorna o dobro do valor
        System.out.println(valor5);//valor não será alterado

        Function<Integer, Object> buscarUsuario = idUsuario -> //buscar
                new Object();
        //System.out.println(buscarUsuario(15));

    }




    }

