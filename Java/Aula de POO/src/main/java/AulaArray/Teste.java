package AulaArray;

public class Teste {
    public static void main(String[] args){
        int[] meuArray = {8,14,23,64,87,99,128, 256};
        System.out.println("número de elementos: " +meuArray.length);
        System.out.println();
        System.out.println("Os primeiros sete elementos são:");
        for(int i=0; i<7; i++){
            System.out.println(meuArray[i]);
        }
        System.out.println();
        System.out.println("O quinto elemento do array é o: " +meuArray[4]);

    }
}
