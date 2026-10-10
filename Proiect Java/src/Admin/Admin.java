package Admin;

import Admin.Add.ComandAddCurs;
import Admin.Add.ComandAddProfesori;
import Admin.Add.ComandAddStudent;
import Admin.Cautare.CautareCurs;
import Admin.Cautare.CautarePersoana;
import Admin.Eliminare.EliminareCurs;
import Admin.Eliminare.EliminarePersoana;
import Admin.InscriereEvaluare.EvaluareStudent;
import Admin.InscriereEvaluare.InscriereStudent;
import Cursuri.ListaCursuri;
import Persoane.Persoana.ListaPersoane;

public interface Admin {
    public CautarePersoana getCautareProfesorPrinNume();
    public CautarePersoana getcautareStudentPrinNume();
    public ComandAddProfesori getAddProfesori();
    public ComandAddStudent getAddStudent();
    public EliminarePersoana getEliminareProfesor();
    public EliminarePersoana getEliminareStudent();
    public ComandAddCurs getAddCurs();
    public EliminareCurs getEliminareCurs();
    public CautareCurs getCautareCurs();
    public EvaluareStudent getEvaluare();
    public InscriereStudent getInscriereStudent();
    public ListaCursuri getCursuri();
    public ListaPersoane getProfesori();
    public ListaPersoane getStudenti();;
}
