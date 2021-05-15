package br.com.digitalinnovationone.API;

public class funcaoAltaOrdem {
    public static void main(String[] args){
        Calculo soma = (a, b) -> a+b;
        Calculo subtracao = (a, b) -> a-b;
        Calculo divisao = (a, b) -> a/b;
        Calculo multiplicacao = (a, b) -> a*b;
            System.out.println(executarOperacao(soma, 1, 3));
            System.out.println(executarOperacao(subtracao, 1, 3));
            System.out.println(executarOperacao(divisao, 1, 3));
            System.out.println(executarOperacao(multiplicacao, 1, 3));

    }
    public static int executarOperacao(Calculo soma, int a, int b){
        return soma.calcular(a, b);
    }
}

interface Calculo{
    public int calcular(int a, int b);
}