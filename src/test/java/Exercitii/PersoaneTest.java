package Exercitii;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PersoaneTest {

    @Test

    public void persoaneTest() {
        Persoane Persoana1 = new Persoane("Popa", "Ioana", "Cluj-Napoca", "Romania", 26, true);
        Persoane Persoana2 = new Persoane("Stoica", "Iulia", "Brasov", "Romania", 28, true);
        Persoane Persoana3 = new Persoane("Alb", "Andrei", "Sibiu", "Romania", 30, false);
        Persoane Persoana4 = new Persoane("Pop", "Gabriela", "Bucuresti", "Romania", 28, true);
        Persoane Persoana5 = new Persoane("Tomescu", "Alexandru", "Iasi", "Romania", 30, false);
        Persoane Persoana6 = new Persoane("Dinu", "Cristi", "Cluj-Napoca", "Romania", 18, false);


        HashMap<String, Persoane> hashMap = new HashMap<>();
        hashMap.put("Ioana", Persoana1);
        hashMap.put("Iulia", Persoana2);
        hashMap.put("Andrei", Persoana3);
        hashMap.put("Gabriela", Persoana4);
        hashMap.put("Alexandru", Persoana5);
        hashMap.put("Dinu", Persoana6);

        Persoane persoana = hashMap.get("Gabriela");
        System.out.println(persoana);
        System.out.println(persoana == Persoana4);


        List<Persoane> listaPersoane = new ArrayList<>();
        listaPersoane.add(Persoana1);
        listaPersoane.add(Persoana2);
        listaPersoane.add(Persoana3);
        listaPersoane.add(Persoana4);
        listaPersoane.add(Persoana5);
        listaPersoane.add(Persoana6);
        HashMap<String, Persoane> hashMap2 = new HashMap<>();
        Persoane pers1 = listaPersoane.get(4);
        String prenume = pers1.fname;
        hashMap2.put(prenume, pers1);


        HashMap<String, Persoane> hashMap1 = new HashMap<>();
        for (int i = 0; i < listaPersoane.size(); i++) {
            Persoane pers = listaPersoane.get(i);
            String p = pers.fname;
            hashMap1.put(p, pers1);
        }






        /*printNumePrenumeFemei(listaPersoane);
        System.out.println("=================");
        printNumePrenumeVarstaPeste20(listaPersoane, 29);
        printPersoaneCluj(listaPersoane, "Cluj-Napoca");*/

    }

    public HashMap grupareOras(List<Persoane> listaPers) {
        HashMap<String, List<Persoane>> mapOrasPersoana = new HashMap<>();


        for (int i = 0; i < listaPers.size(); i++) {
            Persoane perso = listaPers.get(i);


            String oras = perso.city;
            if (mapOrasPersoana.containsKey(oras)) {
                List<Persoane> persoanes = mapOrasPersoana.get(oras);
                persoanes.add(perso);
            } else {
                List<Persoane> persoane2 = new ArrayList<>();
                persoane2.add(perso);
                mapOrasPersoana.put(oras, persoane2);
            }
        }
        return mapOrasPersoana;
    }

    public HashMap grupareVarsta(List<Persoane> listaPersoane) {
        HashMap<Integer, List<Persoane>> mapVarstaPersoane = new HashMap<>();

        for (int i = 0; i < listaPersoane.size(); i++) {
            Persoane persAge = listaPersoane.get(i);
            Integer varsta = persAge.age;

            if (mapVarstaPersoane.containsKey(varsta)) {
                List<Persoane> persoaneAge = mapVarstaPersoane.get(varsta);
                persoaneAge.add(persAge);
            } else {
                List<Persoane> newList = new ArrayList<>();
                newList.add(persAge);
                mapVarstaPersoane.put(varsta, newList);

            }
        }

        return mapVarstaPersoane;
    }

    public void printNumePrenumeFemei(List<Persoane> listaPersoane) {
        for (int i = 0; i < listaPersoane.size(); i++) {
            Persoane element = listaPersoane.get(i);
            if (element.sex == true) {
                System.out.println("Numele = " + element.fname + " Prenume= " + element.lname + " Feminin = " + element.sex);
            }

        }
    }

    public void printNumePrenumeVarstaPeste20(List<Persoane> listaPersoane, int varsta) {
        for (int i = 0; i < listaPersoane.size(); i++) {
            Persoane element1 = listaPersoane.get(i);
            if (element1.age > varsta && !element1.isWoman()) {
                System.out.println("Numele = " + element1.fname + " Prenume = " + element1.lname + " Varsta = " + element1.age);
            }
        }
    }

    public void printPersoaneCluj(List<Persoane> listaPersoane, String city) {
        for (int i = 0; i < listaPersoane.size(); i++) {
            Persoane element2 = listaPersoane.get(i);
            if (element2.city.equals(city)) {
                System.out.println("Persoana " + element2.lname + " este din orasul " + element2.city);
            }
        }

    }


    public void print() {
        System.out.println();
        System.out.println(" Meniu : ");
        System.out.println("================");
        System.out.println("1. Filtru barbati mai mare decat varsta: ");
        System.out.println("2. Filtru persoane oras: ");
        System.out.println("3. Afiseaza numele tuturor femeilor: ");
        System.out.println("4. Afiseaza sinonim pentru: ");
        System.out.println("5. Adauga sinonim pentru : ");
        System.out.println("6: Gruparea dupa oras este: ");
        System.out.println("7. Gruparea dupa varsta este: ");
        System.out.println();
    }

    public String cititTastatura() {
        String cuvant = "";
        Scanner scanner = new Scanner(System.in);
        cuvant = scanner.nextLine();
        return cuvant;

    }

    public static void main(String[] args) {
        new PersoaneTest().Application();
    }

    public void Application() {
        Persoane Persoana1 = new Persoane("Popa", "Ioana", "Cluj-Napoca", "Romania", 26, true);
        Persoane Persoana2 = new Persoane("Stoica", "Iulia", "Brasov", "Romania", 28, true);
        Persoane Persoana3 = new Persoane("Alb", "Andrei", "Sibiu", "Romania", 30, false);
        Persoane Persoana4 = new Persoane("Pop", "Gabriela", "Bucuresti", "Romania", 28, true);
        Persoane Persoana5 = new Persoane("Tomescu", "Alexandru", "Iasi", "Romania", 30, false);
        Persoane Persoana6 = new Persoane("Dinu", "Cristi", "Cluj-Napoca", "Romania", 18, false);
        List<Persoane> listaPersoane = new ArrayList<>();
        listaPersoane.add(Persoana1);
        listaPersoane.add(Persoana2);
        listaPersoane.add(Persoana3);
        listaPersoane.add(Persoana4);
        listaPersoane.add(Persoana5);
        listaPersoane.add(Persoana6);


        HashMap<String, String> sinonime = new HashMap<>();
        sinonime.put("destept", "istet");
        sinonime.put("frumos", "dragut");
        sinonime.put("rau", "malefic");
        sinonime.put("cuminte", "bun");


        while (true) {
            print();
            String userInput = cititTastatura();
            if (userInput.equals("1")) {
                System.out.println("care varsta?");
                String varsta = cititTastatura();
                printNumePrenumeVarstaPeste20(listaPersoane, Integer.valueOf(varsta));
            } else if (userInput.equals("2")) {
                System.out.println("care oras?");
                String oras = cititTastatura();
                printPersoaneCluj(listaPersoane, oras);
            } else if (userInput.equals("3")) {
                printNumePrenumeFemei(listaPersoane);
            } else if (userInput.equals("4")) {
                System.out.println("Care e cuvantul pentru care vrei sinonim?");
                String cuvant = cititTastatura();
                String sinonim = sinonime.get(cuvant);
                System.out.println("Pentru cuvantul respectiv sinonim este: " + sinonim);
            } else if (userInput.equals("5")) {
                System.out.println("Care e cuvantul?");
                String cuv = cititTastatura();
                System.out.println("Care e sinonimul?");
                String sino = cititTastatura();
                sinonime.put(cuv, sino);
                sinonime.put(sino, cuv);
            } else if (userInput.equals("6")) {
                System.out.println("Gruparea dupa orasul : ");
                HashMap oras = grupareOras(listaPersoane);
                for (Object entry : oras.entrySet()) {
                    System.out.println(entry);
                    System.out.println("6: Gruparea dupa oras este: ");

                }
            }
        }


    }

    public static class HRManager {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList<RegistruStudenti.Employee> emplist = new ArrayList<RegistruStudenti.Employee>();

            while (true) {
                System.out.println("add or list or exit? ");
                String userInput = scanner.nextLine();
                if (userInput.equals("exit")) {
                    System.out.println("Bye for now.");
                    break;
                }

                if (userInput.equals("add")) {

                }
                System.out.println("Enter your employee name: ");
                String employeename = scanner.nextLine();

                System.out.println("Enter your employee departament: ");
                String employeedept = scanner.nextLine();

                System.out.println("Enter your employee  title: ");
                String employeetitile = scanner.nextLine();

                //CREATE A EMPLOYEE OBJECT
                RegistruStudenti.Employee emp = new RegistruStudenti.Employee();
                emp.setDepartament(employeename);
                emp.setDepartament(employeedept);
                emp.setTitle(employeetitile);

                emplist.add(emp);



            }


        }

    }
}
