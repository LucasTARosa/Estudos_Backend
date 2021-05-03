package Exercícios;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo, double valorVenal){
        super(modelo, marca, valorVenal);
    }
    public Carro(String marca, String modelo, double valorVenal, int portas){
        super(marca, modelo, valorVenal);
        this.portas = portas;
    }
    private int portas;
    public int getPortas(){
        return portas;
    }
    public void setPortas(int portas){
        this.portas = portas;
    }

}
