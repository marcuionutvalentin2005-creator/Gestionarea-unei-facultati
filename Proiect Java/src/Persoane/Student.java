package Persoane;
import Cursuri.ListaCursuri;
import Persoane.Persoana.Persoana;

public class Student extends Persoana {
    private int an;
    public Student(String nume, String CNP, String mail, int an, int numarulMatricol) {
        super(nume, numarulMatricol, mail,CNP);
        this.an=an;
    }

    public int getAn() {
        return an;
    }
}
