package Cars;

import java.util.ArrayList;
import java.util.List;

public class Registru {
    List<Car> lista;

    public Registru() {
        lista = creeazaMasini();
    }

    public static Decapotabila creeazaDecapotabila(String culoare, String marca, int an) {
        return new Decapotabila(culoare, marca, an);
    }

    public static Capotabila creeazaCapotabila(String culoare, String marca, int an) {
        return new Capotabila(culoare, marca, an);
    }

    public static List<Car> creeazaMasini() {
        List<Car> list = new ArrayList<>();
        Capotabila car1 = creeazaCapotabila("rosie", "bmw", 2009);
        Capotabila car2 = creeazaCapotabila("alba", "audi", 2018);
        Capotabila car3 = creeazaCapotabila("gri", "mercedes", 2007);
        list.add(car1);
        list.add(car2);
        list.add(car3);

        Decapotabila d1 = creeazaDecapotabila("rosie", "dacia", 2005);
        Decapotabila d2 = creeazaDecapotabila("gri", "skoda", 2005);
        Decapotabila d3 = creeazaDecapotabila("albastra", "audi", 2001);
        list.add(d1);
        list.add(d2);
        list.add(d3);
        return list;
    }


    public List<Car> filterByColor(String culoare) {
        List<Car> listaMasini = new ArrayList<>();
        for (int i = 1; i < lista.size(); i++) {
            Car car = lista.get(i);
            if (culoare.equals(car.getCuloare())) {
                listaMasini.add(car);
            }
        }
        return listaMasini;
    }


    public List<Car> filtruDecapotabila() {
        List<Car> listaDecapotabile = new ArrayList<>();
        for (Car element : lista) {
            if (element.isDecapotabila()) {
                listaDecapotabile.add(element);

            }
        }
        return listaDecapotabile;
    }


    public List<Car> masiniMaiVechiDecatX(int x) {
        List<Car> listaMasiniVechi = new ArrayList<>();
        for (Car element: lista) {
            if (element.getAn() < x) {
                listaMasiniVechi.add(element);

            }

        }
        return listaMasiniVechi;
    }


    //suma nr de pe pozitii pare dintr-o lista;

    public Integer nrPare(List<Integer> listaNumere) {
        int suma = 0;
        for (int i = 0; i < listaNumere.size() ; i ++) {
            if ( i % 2 == 0) {
                int element = listaNumere.get(i);
                suma = suma + element;
            }

        }

        return suma;
    }

    public Integer numerePare(List<Integer> listNr) {
        int suma = 0;
        int i = 0;
        for (int element : listNr ) {
            if (i % 2 == 0) {
                suma = suma + element;
            }
            i++;
        }


        return  suma;
    }


}
