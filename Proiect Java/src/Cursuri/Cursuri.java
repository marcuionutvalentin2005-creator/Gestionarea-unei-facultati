package Cursuri;

import Catalog.Catalog;
import Persoane.Profesor;

public interface Cursuri {
    public Profesor getProfesor();
    public Catalog getCatalog();
    public void setProfesor(Profesor profesor);
    public void setCatalog(Catalog catalog);
    public Evaluare getEvaluare();
    public InscriereStudent getInscriere();
}
