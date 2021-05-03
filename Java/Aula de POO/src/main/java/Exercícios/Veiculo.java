package Exercícios;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double valorVenal;

    public Veiculo(String marca, String modelo, double valorVenal){
        this.marca = marca;
        this.modelo = modelo;
        this.valorVenal = valorVenal;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getValorVenal(){
        return valorVenal;
    }
    public void setValorVenal(double valorVenal){
        this.valorVenal = valorVenal;
    }
}
