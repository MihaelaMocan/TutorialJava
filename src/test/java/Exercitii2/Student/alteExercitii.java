package Exercitii2.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class alteExercitii {
    public static void main(String[] args) {
        studentList();
        List<Studenti> studenti = new ArrayList<>();
        Studenti stud6 = new Studenti("Mia", 2000);
        studenti.add(stud6);
        Test test = new Test();
        List<Studenti> list = test.returnStudenti();
        studenti.addAll(list);
        alteExercitii ex = new alteExercitii();
        HashMap harta= ex.numeMetoda(studenti);
        System.out.println(harta);
    }




    //1.o metoda care primeste o lista de studenti si da inapoi un map avand ca cheie varsta studentilor si ca valoare numele lor
    //2. test care verifica ca varsta are corespondent corect

    //(functionalitate de categorizare a studentilor dupa varsta)
    //3. o metoda care primeste o lista si da inapoi un map avand ca cheie varsta studentilor si ca valoare lista cu obiectul student


    public HashMap numeMetoda(List<Studenti> lista) {
        HashMap<Integer, List<Studenti>> map = new HashMap<>();

        for (int i = 1; i < lista.size(); i++) {
            Studenti element = lista.get(i);
            Integer age = element.getVarsta();
            List<Studenti> list = map.get(age);
            if (list == null) {
                List<Studenti> newList = new ArrayList<>();
                newList.add(element);
                map.put(age, newList);
            }
            else {
                list.add(element);
            }


        }
        return map;
    }

    public static void studentList() {
        HashMap<Integer, String> listaStudenti = new HashMap<>();
        List<Studenti> studenti = new ArrayList<>();
        Studenti stud6 = new Studenti("Mia", 2000);
        studenti.add(stud6);
        Test test = new Test();
        List<Studenti> list = test.returnStudenti();
        studenti.addAll(list);


        for (Studenti element : studenti) {
            listaStudenti.put(element.getVarsta(), element.getNume());

        }


        System.out.println(listaStudenti);

    }


}
