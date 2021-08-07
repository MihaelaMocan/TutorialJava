package Exercitii;

import java.util.ArrayList;
import java.util.List;

public class RegistruStudenti {
    private final List<Student> list;

    //Registru studenti ( primeste lista studenti in constructor care e construita altundeva)
    //trebuia data lista de studenti

    public RegistruStudenti(List<Student> list) {
        this.list = list;

    }

    public List<Student> getFemale() {
        List<Student> list = new ArrayList<>();
        for (Student s : this.list ) {
            if (s.sex.equals("feminin")) {
                list.add(s);
            }
        }
        return list;
    }

    public List<Student> getMale() {
        List<Student> list = new ArrayList<>();
        for (Student s: this.list) {
            if (s.sex.equals("masculin")) {
                list.add(s);
            }
        }
        return list;
    }

    public List<Student> getAge(int varsta) {
        List<Student> list = new ArrayList<>();
        for (Student s: this.list) {
            if (s.varsta<varsta) {
                list.add(s);
            }
        }
        return list;
    }

    public static class Employee {

        private String name;

        private String departament;
        private String title;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDepartament() {
            return departament;
        }
        public void setDepartament(String departament) {
            this.departament = departament;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
    }
}
