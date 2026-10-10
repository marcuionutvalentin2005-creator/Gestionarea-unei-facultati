package Cursuri;

import Catalog.Catalog;
import Persoane.Profesor;
import Catalog.Catalogul;
public class Curs implements Cursuri{

Profesor profesor;
Catalog catalog;
InscriereStudent inscriere;
Evaluare evaluare;
    public Curs(Profesor profesor) {
        this.profesor = profesor;
        this.catalog = new Catalogul();
        inscriere=new InscriereaStudentului(catalog);
        evaluare = new Evaluarea(catalog);
    }
@Override
    public Profesor getProfesor() {
        return profesor;
    }
@Override
    public Catalog getCatalog() {
        return catalog;
    }
@Override
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
@Override
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
@Override
    public InscriereStudent getInscriere() {
        return inscriere;
    }
@Override
    public Evaluare getEvaluare() {
        return evaluare;
    }
}
