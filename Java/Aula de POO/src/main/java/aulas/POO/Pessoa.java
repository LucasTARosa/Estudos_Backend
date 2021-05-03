package aulas.POO;

public class Pessoa {
    public String nome = "Lucas";
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String falar(){
        return "Oi, meu nome é " + getNome();
    }
    public String caminhar(){
        return "Estou andando até São Paulo";
    }
}

