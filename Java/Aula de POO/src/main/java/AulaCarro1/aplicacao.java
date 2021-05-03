package AulaCarro1;

public class aplicacao {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.setMarca("BMW");
        carro.setModelo("X6");
        carro.setQuantidadeDePortas(4);
        carro.setValorVenal(1000.0);

        Motocicleta moto = new Motocicleta();
        moto.setMarca("Honda");
        moto.setModelo("CG");
        moto.setCilindradas("150");
        moto.setValorVenal(1000.0);

        System.out.println("marca: " +carro.getMarca());
        System.out.println("modelo: " +carro.getModelo());
        System.out.println("Quantidade de portas: " +carro.getQuantidadeDePortas() + " portas");
        System.out.println("imposto: " +carro.calculaImposto());
        System.out.println("Acelerando..");
        carro.acelera();
        System.out.println();
        System.out.println("marca: " +moto.getMarca());
        System.out.println("modelo: " +moto.getModelo());
        System.out.println("cilindradas: " +moto.getCilindradas() + " cc");
        System.out.println("imposto: " +moto.calculaImposto());
        System.out.println("Acelerando..");
        moto.acelera();
    }

}
