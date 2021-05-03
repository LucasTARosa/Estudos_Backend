package Aula3;

public class Exercicio2 {
    public static void main(String[] args){
        Pessoa eu = new Pessoa ("Lucas", 4, 11, 1993);
        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade() + " anos");

        eu.setNome("Lucas Giusto");
        System.out.println(eu.getNome());
    }
}
