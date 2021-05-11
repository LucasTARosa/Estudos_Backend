package Aula.utilMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMap {
    public static void main(String[] args){
        Map<String, Integer> campeoesMundiais = new HashMap<>();

        //adiciona os campeões mundiais da fifa no mapa
        campeoesMundiais.put("Brasil", 5);
        campeoesMundiais.put("Alemanha", 4);
        campeoesMundiais.put("Itália", 4);
        campeoesMundiais.put("Uruguai", 2);
        campeoesMundiais.put("Argentina", 2);
        campeoesMundiais.put("França", 2);
        campeoesMundiais.put("Inglaterra", 1);
        campeoesMundiais.put("Espanha", 1);

        System.out.println(campeoesMundiais);

        //atualiza o valor para a chave Inglaterra
        campeoesMundiais.put("Inglaterra", 6);
        System.out.println(campeoesMundiais);

        //retorna a argentina
        System.out.println(campeoesMundiais.get("Argentina"));

        //retorna se existe ou não um campeão França
        System.out.println(campeoesMundiais.containsKey("França"));

        //remove o campeão França
        campeoesMundiais.remove("França");
        System.out.println(campeoesMundiais.containsKey("França"));

        //Retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeoesMundiais.containsValue(6));

        //retorna o tamanho do mapa e a lista
        System.out.println(campeoesMundiais.size());
        System.out.println(campeoesMundiais);

        //nave nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundiais.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        System.out.println(campeoesMundiais);

        //verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundiais.containsKey("Estados Unidos"));

        //verifica se o mapa contem o valor 5
        System.out.println(campeoesMundiais.containsValue(5));

        //verofoca p ta,amjp amtes e depois de limpar o mapa
        System.out.println(campeoesMundiais.size());
        campeoesMundiais.clear();
        System.out.println(campeoesMundiais.size());
    }
}
