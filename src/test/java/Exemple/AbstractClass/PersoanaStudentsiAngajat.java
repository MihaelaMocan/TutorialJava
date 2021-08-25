package exemple.AbstractClass;

public class PersoanaStudentsiAngajat extends persoana{


    private String nume;
    private String prenume;
    private int varsta ;
    private String job;


    public PersoanaStudentsiAngajat(String nume, String prenume, int varsta, String job){

        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.job=job;



    }

    @Override
    public String toString() {
        return "persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", job='" + job + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getJob() {
        return job;
    }


    @Override
    void munceste() {
        System.out.println("Persoana angajat cu numele " +getNume() + "si prenumele" + getPrenume()+" munceste."  );

    }


    @Override
    void invata() {
        System.out.println("Persoana student cu numele " +getNume() + "si prenumele" + getPrenume()+" invata."  );
    }

    public void detaliistudentangajat(){
        detaliipersoana();
        System.out.println("Persoana student, angajt "+ getNume() + " "+ getPrenume());
    }
}
