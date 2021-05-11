package Aula.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class aula {
    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

//O método peek consulta a lista, mostra o primeiro elemento, mas sem remover
        String primeiraCliente = filaBanco.peek();
        System.out.println(primeiraCliente);
        System.out.println(filaBanco);

//O método poll consulta a lista, mostra o primeiro elemento e remove o primeiro elemento
        String clienteASerAtendida = filaBanco.poll();
        System.out.println(clienteASerAtendida);
        System.out.println(filaBanco);

//Retorna a fila
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

//Com a fila vazia, acaba ocorrendo um erro
      /*  filaBanco.clear();
        String primeiroElementoOuErro = filaBanco.element();
        System.out.println(primeiroElementoOuErro);
        System.out.println(filaBanco);
*/
        for (String client: filaBanco){
            System.out.println(">" +client);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("--->" +iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());


    }
}
