package Admin;

import Admin.Add.*;
import Admin.Cautare.*;
import Admin.Eliminare.*;
import Admin.InscriereEvaluare.EvaluareStudent;
import Admin.InscriereEvaluare.EvaluareaStudentului;
import Admin.InscriereEvaluare.InscriereStudent;
import Admin.InscriereEvaluare.InscriereaStudentuui;
//import Admin.Vizualizare.*;
import Cursuri.ListaCursuri;
import Cursuri.ListaCursurilor;
import Persoane.Persoana.ListaPersoane;
import Persoane.Persoana.ListaPersoanelor;
/*
Adminul trebuie sa faca orice actiune si sa poata modifica orice detaliu
 */
public class Adminul implements Admin{
    ListaCursuri cursuri;//Hasmap cu toate cursurile, cheia este numele
    ListaPersoane profesori;//Hasmap cu toati profesorii, cheia este numele
    ListaPersoane studenti;//Hasmap cu toati studentii, cheia este numele
    CautarePersoana cautareProfesorPrinNume;
    CautarePersoana cautareStudentPrinNume;
    ComandAddProfesori addProfesori;//adaugare profesori
    ComandAddStudent addStudent;//adaugare studenti
    EliminarePersoana eliminareProfesor;
    EliminarePersoana eliminareStudent;
    ComandAddCurs addCurs;//adaugare cursuri
    EliminareCurs eliminareCurs;
    CautareCurs cautareCurs;
    EvaluareStudent evaluare;//da note studentilor
    InscriereStudent inscriereStudent;//inscrie studenti la cursiri
    /*  Afisare afisareProfesori;
      Afisare afisareStudenti;
      Afisare afisareCursuri;
      Inspctere inspectereCurs;
      Inspctere inspectereProfesor;
      Inspctere inspectereStudent;*/
    public Adminul() {
        cursuri=new ListaCursurilor();
        profesori=new ListaPersoanelor();
        studenti=new ListaPersoanelor();
        cautareProfesorPrinNume=new CautareaPersoaneiNume(profesori);
        cautareStudentPrinNume=new CautareaPersoaneiNume(studenti);
        addProfesori=new ComandaAddProfesor(profesori,cursuri);
        addStudent=new ComandaAddStudenti(studenti,cursuri);
        eliminareProfesor=new EliminareaProfesor(cautareProfesorPrinNume,profesori,cursuri);
        eliminareStudent=new EliminareStudent(cautareStudentPrinNume,studenti,cursuri);
        addCurs=new CoamandaAddCurs(cursuri,profesori);
        eliminareCurs=new EliminareaCursului(cursuri);
        cautareCurs = new CautareaCursului(cursuri);
        evaluare=new EvaluareaStudentului(cautareCurs);
        inscriereStudent=new InscriereaStudentuui(cautareCurs,(CautareaPersoaneiNume) cautareStudentPrinNume);
       /* afisareProfesori=new AfiseareaPersoanelor(profesori);
        afisareStudenti=new AfiseareaPersoanelor(studenti);
        afisareCursuri=new AfisareaCursurilor(cursuri);
        inspectereCurs=new InspectareaCursului(cautareCurs);
        inspectereStudent=new InspectareaPersoane((CautareaPersoanei) cautareStudent);
        inspectereProfesor=new  InspectareaPersoane((CautareaPersoanei) cautareProfesor);*/
    }
    @Override
    public CautarePersoana getCautareProfesorPrinNume() {
        return cautareProfesorPrinNume;
    }
    @Override
    public CautarePersoana getcautareStudentPrinNume() {
        return cautareStudentPrinNume;
    }
    @Override
    public ComandAddProfesori getAddProfesori() {
        return addProfesori;
    }
    @Override
    public ComandAddStudent getAddStudent() {
        return addStudent;
    }
    @Override
    public EliminarePersoana getEliminareProfesor() {
        return eliminareProfesor;
    }
    @Override
    public EliminarePersoana getEliminareStudent() {
        return eliminareStudent;
    }
    @Override
    public ComandAddCurs getAddCurs() {
        return addCurs;
    }
    @Override
    public EliminareCurs getEliminareCurs() {
        return eliminareCurs;
    }
    @Override
    public CautareCurs getCautareCurs() {
        return cautareCurs;
    }
    @Override
    public EvaluareStudent getEvaluare() {
        return evaluare;
    }
    @Override
    public InscriereStudent getInscriereStudent() {
        return inscriereStudent;
    }
    @Override
    public ListaCursuri getCursuri() {
        return cursuri;
    }
    @Override
    public ListaPersoane getProfesori() {
        return profesori;
    }
    @Override
    public ListaPersoane getStudenti() {
        return studenti;
    }
}
