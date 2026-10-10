package Persoane;
import Cursuri.ListaCursuri;
import Persoane.Persoana.Persoana;

public class Profesor extends Persoana {
    private String grad;
    public Profesor(String nume, int identificationNumber, String mail,String CNP, String grad) {
        super(nume, identificationNumber, mail,CNP);
        this.grad = grad;
    }

    public String getGrad() {
        return grad;
    }
}
