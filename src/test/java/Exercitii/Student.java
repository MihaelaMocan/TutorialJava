package Exercitii;

import java.util.ArrayList;
import java.util.List;

public class Student {
        String nume;
        String prenume;
        int varsta;
        String sex;

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public int getVarsta() {
        return varsta;
    }
    public void setVarstat(int varsta){
        this.varsta = varsta;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Student(String nume, String prenume, int varsta, String sex) {
            this.nume = nume;
            this.prenume = prenume;
            this.varsta = varsta;
            this.sex = sex;
        }
        public String toString() {
            return "name" + "prenume" + varsta + "sex";
        }

        public static void main(String[] args) {
            String letter= "a";
            System.out.println("Mircea".contains(letter));
        }

        public static List<Student> extracted() {
            Student s1 = new Student("Puscas", "Sebastian", 28, "masculin");
            Student s2 = new Student("Mocan", "Mihaela", 27, "feminin");
            Student s3 = new Student("Macovei", "Steluta", 28, "feminin");
            Student s4 = new Student("Souca", "Lavinia", 27, "feminin");
            Student s5 = new Student("Puscas", "Mihaela", 29, "feminin");

            List<Student> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s4);
            list.add(s5);
            return list;
        }


        //Clasa student cu nume prenume, varsta,sex,contructor,toString
    //Registru studenti ( primeste lista studenti in constructor care e construita altundeva)
    //cu filtru mai mare /mai mic dupa varsta, getFemales, getMales, get all having nume contain letter choosen by user.




}
