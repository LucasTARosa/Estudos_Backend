package br.com.digitalinnovationone.lambda;

public class aula {
    public static void main(String[] args){

        funcao1 colocarPrefixoSenhorNaString = new funcao1(){
            @Override
            public String gerar(String valor7) {return "Sr. " +valor7;}
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }

}

@FunctionalInterface
interface funcao1 {
    String gerar(String valor7);
}
