package Exercitii2.Student;

import java.util.ArrayList;
import java.util.List;

public class Registru {

    //Repository care primeste lista de studenti in constructor
    List<Studenti> listStudenti;

    Registru(List<Studenti> lista) {
        this.listStudenti = lista;
    }

    //metoda da imapoi toti elevi cu varsta mai mare decat x

    public List<Studenti> varstaStudenti(int x) {
        List<Studenti> nouaLista = new ArrayList<>();

        for(Studenti element : listStudenti){
            if (element.getVarsta() > x) {
                nouaLista.add(element);

            }
        }

        return nouaLista;

    }
    //metoda care da inapoi toti studentii care contin o anumita litera in nume;

    public List<Studenti> literaNume (String litera) {
        List<Studenti> listaCuLiteraX = new ArrayList<>();

        for (int i = 0; i < listStudenti.size(); i++) {
            Studenti element = listStudenti.get(i);
            if (element.getNume().contains(litera)) {
                listaCuLiteraX.add(element);
            }

        }



        return listaCuLiteraX;
    }
}
