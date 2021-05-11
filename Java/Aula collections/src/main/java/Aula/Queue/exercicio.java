package Aula.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class exercicio {
    public static void main(String[] args) {

        Queue<String> filaLanchonete = new LinkedList<>();

        filaLanchonete.add("Juliana");
        filaLanchonete.add("Pedro");
        filaLanchonete.add("Carlos");
        filaLanchonete.add("Larissa");
        filaLanchonete.add("João");

        System.out.println(filaLanchonete);

//O método peek consulta a lista, mostra o primeiro elemento, mas sem remover
        String primeiraCliente = filaLanchonete.peek();
        System.out.println(primeiraCliente);
        System.out.println(filaLanchonete);

//O método poll consulta a lista, mostra o primeiro elemento e remove o primeiro elemento
        String clienteASerAtendida = filaLanchonete.poll();
        System.out.println(clienteASerAtendida);
        System.out.println(filaLanchonete);

//Adicionando mais um elemento na lista
        filaLanchonete.add("Daniel");
        System.out.println(filaLanchonete);

        //Verificando o tamanho da lista
        System.out.println(filaLanchonete.size());

        //Verifica se a lista esta vazia
        System.out.println(filaLanchonete.isEmpty());

        //Verifica se o nome Carlos está na lista
        System.out.println(filaLanchonete.contains("Carlos"));
    }
}
