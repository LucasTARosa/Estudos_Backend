package IMC;

public class aplicacao {
    public static void main(String[] args){
        Pessoa Lucas = new Pessoa("Lucas", 1.75, 80);
        Pessoa Luana = new Pessoa("Luana", 1.60, 61);
        System.out.println("Nome: " +Lucas.getNome());
        System.out.println("Altura: " +Lucas.getAltura() +"m");
        System.out.println("Peso: " +Lucas.getPeso() + "Kg");
        System.out.printf("Seu imc é: %.2f %n", Lucas.imc());
        Lucas.classificacao();
        System.out.println("-----------------------");
        System.out.println("Nome: " +Luana.getNome());
        System.out.println("Altura: " +Luana.getAltura() + "m");
        System.out.println("Peso: " +Luana.getPeso() + "Kg");
        System.out.printf("Seu imc é: %.2f %n", Luana.imc());
        Luana.classificacao();

    }

}
