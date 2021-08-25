package Exercitii;

import Exemple.Multimi;
import org.junit.Test;

import java.util.*;

public class exercise {

    @Test
    public void methodTest() {
        Persoane pers1 = new Persoane("Mac", "Lana", "Tokyo", "Japan", 22, true);
        String rep = pers1.toString();
        System.out.println(rep);
        System.out.println(pers1);
       /* NumereIntregi(3,2,11);
        numarNatural(5);
        determinaSuma(3);
        numarNatural2(5);
        mediaAritmetica();
        anBisect(2000);*/
        //parSauImpar();
        //americanFlag();
        //start();
       /* reverseAString();
        List<Integer> lista = new ArrayList<>();
        lista.add(12);
        lista.add(9);
        lista.add(2);
        lista.add(2);
        sumNrPare(lista);
        adunare();
        produs();
        List<String> cuvinte = new ArrayList<>();
        String prop = "Ana are mere si pere";
        cuvinte.add("pere");
        cuvinte.add("Ana");
        System.out.println( listaCuCuvinte(prop, cuvinte));*/
        listaDeCumparaturi();
        listaFarmaciaTei();
        listaCursuri();
        insertAtTheFirstPosition();
        sortList();

    }

    //Verificam daca o propozitie contine mai multe cuvinte
    public boolean listaCuCuvinte(String prop, List<String> cuvinte) {
        for (int i=0; i<cuvinte.size();i++) {
            String element = cuvinte.get(i);
            if (!prop.contains(element)) {
               return false;
            }

        }
        return true;

    }








    //Produsul unei liste fara ultimu element
    public void produs() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(4);
        int produs = 1;
        int lengh = list.size();
        for (int i=0;i<lengh;i++) {
            int element = list.get(i);
            if (i!=lengh-1) {
                produs = produs * element;
            }

        }
        System.out.println(produs);
    }



    //Produsul unei liste fara ultimu element
    public void produs1() {
        List<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(11);
        newList.add(12);
        int produs = 1;
        int lenght = newList.size();
        for(Integer nr:newList){

        }
        for (int i = 1; i < lenght; i ++) {
            int element = newList.get(i);
            if (i!=lenght-1) {
                produs= produs * element;
            }
        }



    }













    //Aduna 2 de 3 ori

    public void adunare() {
        int i = 0;
        int suma = 0;
        while (i<3) {
            suma = suma +2;
            i++;
        }
        System.out.println(suma);
    }

    //Primesti o list si faci suma nr pare;

    public void sumNrPare(List<Integer> list) {

        int suma = 0;
        for(Integer anObject : list) {

            if (anObject % 2 == 0) {
                suma = suma + anObject;

            } else {

            }

        }
        System.out.println(suma);

    }

    //Se printeaza nr pana la 5 daca e impar sau par

    public void parSauImpar() {
        int i = 0;
        while (i <= 5) {
            if (i % 2 == 0) {
                System.out.println(i + " este par");
            } else {
                System.out.println(i + "este impar");
            }
            i++;
        }
    }

    public void americanFlag() {
        int counter =0;
        while (counter<=9) {
            counter+=1;
            int i = 1;
            for (i = 1; i <= 6; i++) {
                if (counter>=9) {
                    System.out.print(" =");
                }
                else {
                    if (counter % 2 == 0) {
                        System.out.print(" *");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            for (int y = 1; y <= 12; y++) {
                System.out.print(" =");
            }
            System.out.println();

        }
    }
    public void start() {
        int counter = 1;
        while (counter<=10) {
            counter+=1;
            System.out.println();
            for (int i =1; i<=6;i++) {
                if(counter>=7) {
                    System.out.print(" = ");
                }
                else {
                    System.out.print(" * ");
                }
            }

        }

        //Write a Java program to reverse a string. Go to the editor
        //Input Data:
        //Input a string: The quick brown fox
        //Expected Output
        //
        //Reverse string: xof nworb kciuq eh


        }
    public void reverseAString() {
        String prop = "The quick brown fox";
        char[] variabila = prop.toCharArray();

        String propInversata = "";
        for (int i=variabila.length-1; i>0;i--) {
            char numeleVariabilei = variabila[i];
            propInversata += numeleVariabilei;
        }
        System.out.println(propInversata);

    }

    public void reverseAnotherString() {
        String prop1 = "Ana are mere";
        char[] var1 = prop1.toCharArray();

        String propInversataa = "";
        for (int i = var1.length-1;i>0;i--) {
            char numVariabilei = var1[1];
            propInversataa += numVariabilei;
        }
    }


    //Se citesc 3 numere intregi. Sa se afiseze cel mai mare dintre ele.

    public void NumereIntregi(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > a && c > b) {
            System.out.println(c);
        }

    }
    //Se citește n număr natural. Calculați suma numerelor naturale mai mici sau egale cu n.

    public void numarNatural(int n) {
        int suma = 0;
        int counter = 1;

        while (counter <= n) {
            suma = suma + counter;
            counter = counter + 1;
        }
        System.out.println("Suma nr este: " + suma);
    }

    public void numarNatural2(int n) {
        int suma = 0;
        while (n > 0) {
            suma = suma + n;
            n--;
        }
        System.out.println("Suma nr este: " + suma);
    }

    //Să se scrie un program care citește numărul natural n și determină suma 2+4+..+(2n).

    public void determinaSuma(int n) {
        int suma = 0;
        int counter = 2;
        while (counter <= n * 2) {
            suma = suma + counter;
            counter = counter + 2;
        }
        System.out.println(suma);
    }

    // Se citesc numere naturale pana cand se introduce numarul 0. Sa se afiseze media aritmetica a numerelor introduse.
    public void mediaAritmetica() {
        int suma = 0;
        int counter = 0;
        int n = 1;
        while (n != 0) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            suma = suma + n;
            counter++;

        }
        n = suma / counter;
        System.out.println(n);
    }

    // Se citeste un numar intreg a reprezetand un an. Sa se verifice daca a este an bisect.
    // ( verifica definitia an bisect pe net)

    public void anBisect(int n) {
        int an = 1;
        if (an % 4 == 0 && an % 100 != 0) {
            System.out.println(an + " e an bisect.");
        } else {
            System.out.println(an + " nu e bisect");
        }

    }

    public void listaDeCumparaturi() {
        HashMap<String, List<String>> listaMea = new HashMap<>();
        List<String> listaCumparaturi = new ArrayList<>();
        listaCumparaturi.add("ovaz");
        listaCumparaturi.add("banane");
        listaCumparaturi.add("lapte de migdale");
        listaCumparaturi.add("hallumi");
        listaCumparaturi.add("pepene");

        listaMea.put("Lista mea", listaCumparaturi);
        System.out.println(listaMea);

    }

    public void listaFarmaciaTei() {
        HashMap<String, List<String>> listaNecesara = new HashMap<>();
        List<String> listaFarmacie = new ArrayList<>();
        listaFarmacie.add("Cleanser");
        listaFarmacie.add("Spirulina");
        listaFarmacie.add("Cbd oil");
        listaFarmacie.add("Mask");
        listaFarmacie.add("lip balm");

        listaNecesara.put("Lista mea 2", listaFarmacie);
        System.out.println(listaNecesara);

    }

    public void listaCursuri() {
        List<String> listaCurs = new ArrayList<>();
        listaCurs.add("Manual tester");
        listaCurs.add("Automation tester");
        for (int i =0; i < listaCurs.size(); i++) {
            System.out.println(listaCurs.get(i));
        }
    }


    // Write a Java program to insert an element into the array list at the first position.

    public void insertAtTheFirstPosition() {
        List<Integer> newList1 = new ArrayList<>();
        newList1.add(4);
        newList1.add(2);
        newList1.add(3);

        System.out.println(newList1);
        newList1.add(0,4);
        System.out.println(newList1);
        newList1.remove(3);
        System.out.println(newList1);



        }


    public void sortList() {
        List<Integer> listaSortata = new ArrayList<>();
        listaSortata.add(22);
        listaSortata.add(12);
        listaSortata.add(2);
        listaSortata.add(60);
        listaSortata.add(44);

        for (int i : listaSortata) {
            System.out.println("Lista nesortata este: " + i);
        }


        Collections.sort(listaSortata);
        System.out.println("Lista soratata este: " + listaSortata);

    }


}