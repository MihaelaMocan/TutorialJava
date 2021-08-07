package Exemple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test
    public void metodaTest() {
        afiseazaListaNumeArray();
        afiseazaListaNumeList();
        afiseazaListaNumeMap();

    }

    public void afiseazaListaNumeArray() {
        String[] listaNume = new String[5];
        listaNume[0] = "Ana";
        listaNume[1] = "Maria";
        listaNume[2] = "Luciana";
        listaNume[3] = "Gabriela";
        listaNume[4] = "Lavinia";

        for (int i = 0; i<listaNume.length; i++) {
            System.out.println(listaNume[i]);
        }
    }

    public void afiseazaListaNumeList() {
        List<String> listaNume = new ArrayList<>();
        listaNume.add("Ana");
        listaNume.add("Maria");
        listaNume.add("Luciana");

        for (int i = 0; i<listaNume.size(); i++) {
            System.out.println(listaNume.get(i));
        }
    }

    public void afiseazaListaNumeMap() {
        HashMap<String, List<String>> listaNumeMap = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Sibiu");
        oraseRomania.add("Brasov");
        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");

        listaNumeMap.put("Romania", oraseRomania);
        listaNumeMap.put("Spania", oraseSpania);

        System.out.println(listaNumeMap);

    }


}
