package aulas.POO;

public class ExemploMetodos {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Carro carro = new Carro();
        pessoa.setNome("Luana");
        System.out.println(pessoa.falar());
        System.out.println(pessoa.caminhar());
        System.out.println(carro.contagem());
        System.out.println(carro.contagem() + " e o motorista se chama "+ pessoa.getNome());
    }
}
