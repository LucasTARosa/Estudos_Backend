package Aula.listasSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args){
        TreeSet<String> treeCapitais = new TreeSet<>();

        //monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Aracaju");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //retorna a última capital no topo da árvore
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo na arvore de capitais parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //exibe a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //exibe todas as capitais no console
        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //exibindo todas as capitais no console
        System.out.println(treeCapitais);

        //navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();
                while(iterator.hasNext()){
                    System.out.println(">" +iterator.next());
                }
                for (String capital: treeCapitais){
                    System.out.println("-->" +capital);
                }
    }
}
