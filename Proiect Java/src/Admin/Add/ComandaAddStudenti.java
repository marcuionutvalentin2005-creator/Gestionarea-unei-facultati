package Admin.Add;

import Cursuri.ListaCursuri;
import Persoane.Persoana.ListaPersoane;
import Persoane.Persoana.Persoana;
import Persoane.Student;

public class ComandaAddStudenti implements ComandAddStudent {
    AddProfesor addProfesor;
    Persoana persoana;
    ListaCursuri cursuri;
    ListaPersoane studenti;
    public ComandaAddStudenti(ListaPersoane studenti,ListaCursuri cursuri) {
        this.addProfesor = new AddPersoane(studenti);
        this.cursuri=cursuri;
    }
    @Override
    public void adaugaStudent(String nume,String CNP,String mail,int an,int numarMatricol)
    {
        persoana=new Student(nume,CNP,mail,an,numarMatricol);
        addProfesor.adaugaProfesori(persoana);
    }
}
