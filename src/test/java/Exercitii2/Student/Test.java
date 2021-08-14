package Exercitii2.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {




    @org.junit.Test
    public void metodaTest() {
        List<Studenti> listaCuStudenti = returnStudenti();
        Registru reg1 = new Registru(listaCuStudenti);
        List<Studenti> studentis = reg1.varstaStudenti(26);
        assert studentis.size() == 4;


        List<Studenti> listFinala = reg1.literaNume("S");
        assert listFinala.size() == 2;
    }


    public List<Studenti> returnStudenti() {
        List<Studenti> listStud = new ArrayList<>();
        Studenti stud1 = new Studenti("Sebi", 1993);
        Studenti stud2 = new Studenti("Mihaela", 1994);
        Studenti stud3 = new Studenti("Ana", 2003);
        Studenti stud4 = new Studenti("Lavinia", 1993);
        Studenti stud5 = new Studenti("Steluta", 1993);
        listStud.add(stud1);
        listStud.add(stud2);
        listStud.add(stud3);
        listStud.add(stud4);
        listStud.add(stud5);
        return listStud;
    }



}
