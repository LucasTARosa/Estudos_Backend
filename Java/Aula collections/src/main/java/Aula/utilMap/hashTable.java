package Aula.utilMap;

import java.util.Hashtable;
import java.util.Map;

public class hashTable {
    public static void main(String[] args){
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        //muda a idade do Pedro
        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        //remove um estudante no índice
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        //recupera um estudante no índice 2
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        //retorna o tamanho da lista
        System.out.println(estudantes.size());

        //navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //navega no registro do mapa
        for (String key : estudantes.keySet()){
            System.out.println(key + " --- " + estudantes.get(key));
        }

        System.out.println(estudantes);
    }
}
