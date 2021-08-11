package Exercitii;

import java.util.ArrayList;
import java.util.List;

public class Exe {




    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(11);
        lista.add(33);
        lista.add(2);
        lista.add(8);
        Exe instantaExercitii = new Exe();
        instantaExercitii.nrPareLista(lista);
        instantaExercitii.sumNrPare();
        instantaExercitii.nrDivCu4(lista);

    }


    //1.printeaza numerele pare dintr-o lista ce o primesti dinafara

    public void nrPareLista(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            int element = lista.get(i);
            if (element % 2 == 0) {
                System.out.println("Numerele pare sunt: " + element);
            }
        }

    }
    //2. suma numerelor impare pana la 20
    public void sumNrPare() {
        int sum = 0;
        for (int i = 1; i <=20; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    //3. suma numerelor divizibile cu 4 dintr-o lista
    public void nrDivCu4(List<Integer> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i ++) {
            int ele = lista.get(i);

            if ( ele % 4 == 0) {
                suma = suma + ele;
            }
        }
        System.out.println(suma);
    }


}
