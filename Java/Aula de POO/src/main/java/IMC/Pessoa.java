package IMC;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    private final double imc;


    public Pessoa(String nome, double altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.imc = peso/(altura*altura);
    }
    public String getNome(){
        return nome;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public double imc() {
        return imc;
    }
    /*public void setNome(String nome){
        this.nome = nome;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
     */

    public void classificacao(){
        if (imc < 16){
            System.out.println("Classificação: Magreza grau III");
        }else if (imc >= 16 && imc < 17){
            System.out.println("Classificação: Magreza grau II");
        }else if (imc >= 17 && imc < 18.5){
            System.out.println("Classificação: Magreza grau I");
        } else if (imc >= 18.5 && imc < 25){
            System.out.println("Classificação: Normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Classificação: Pré-obeso");
        }else if (imc >= 30 && imc < 35){
            System.out.println("Classificação: Obesidade grau I");
        }else if (imc >= 35 && imc < 40){
            System.out.println("Classificação: Obesidade grau II");
        }else if (imc >= 40){
            System.out.println("Classificação: Obesidade grau III");
        }
    }
}
