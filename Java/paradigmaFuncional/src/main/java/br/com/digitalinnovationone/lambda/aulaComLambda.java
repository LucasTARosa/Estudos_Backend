package br.com.digitalinnovationone.lambda;

public class aulaComLambda {
    public static void main(String[] args){
        funcao1 colocarPrefixoSenhorNaString = valor7 -> "Sr. " +valor7;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));


    }
}
