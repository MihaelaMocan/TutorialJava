package Exercitii;

public class Persoane {

    String fname;
    String lname;
    String city;
    String country;
    int age;
    boolean sex;


    public Persoane(String fname, String lname, String city, String country, int age, boolean sex) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.country = country;
        this.age = age;
        this.sex = sex;


    }
    public void printName() {

        System.out.println("Numele persoanei este: " + fname +" " + lname);
    }
    public void printCity() {
        System.out.println("Persoana este din orasul: " + city);
    }
    public void printAge() {
        System.out.println("Varsta persoanei este: " + age);
        }
    public boolean isWoman() {
        if (sex) {
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Persoane{" +
                "fname=" + fname +
                ", lname='" + lname + '\'' +

                '}';
    }
}
