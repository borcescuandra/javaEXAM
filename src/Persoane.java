public class Persoane {

    private int index;
    private String nume;
    private String prenume;
    int varsta;

    public Persoane(int index, String nume, String prenume, int varsta) {
        this.index = index;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
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

    public String toString()
    {
        return "Index: " + index+ System.lineSeparator()  + "Nume: " + nume + System.lineSeparator() +
                "Prenume: " + prenume + System.lineSeparator()+
                "Varsta: " + varsta + System.lineSeparator();
    }


}
