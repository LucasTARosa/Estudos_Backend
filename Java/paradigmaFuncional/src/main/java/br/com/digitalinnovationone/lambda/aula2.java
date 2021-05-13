package br.com.digitalinnovationone.lambda;

public class aula2 {
    public static void main(String[] args){
        funcao2 funcao2 = valor9 -> {
            System.out.println(valor9);
            System.out.println(valor9);
        };
        funcao2.gerar("Astolfo");


    }
}

interface funcao2 {
    void gerar(String valor9);
}
