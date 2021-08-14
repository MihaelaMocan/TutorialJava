package AbstractizareInterfete;

public class Persoana {

    private String nume;
    private String prenume;
    private int varsta;
    private String job;

    public Persoana(String nume, String prenume, int varsta, String job) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", job='" + job + '\'' +
                '}';
    }

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

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
