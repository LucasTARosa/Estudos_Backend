package br.com.digitalinnovationone.fatorialRecursivo;

public class aula2 {
    /* Não funcionou também
    public static void main(String[] args){
        System.out.println(fatorial(5));
    }

    public static int fatorial( int valor );    {
        if (valor == 1) {
            return valor;
        } else {

            return valor * fatorial((valor - 1));
        }
    }*/
    public static void main(String[] args){
        System.out.println(fatorialA(5));
    }
    public static double fatorialA(double valor){
        return fatorialComTailcall(valor, 1);
    }
    public static double fatorialComTailcall(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialComTailcall(valor-1, numero*valor);
    }
}

