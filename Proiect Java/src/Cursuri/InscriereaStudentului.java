package Cursuri;

import Catalog.Catalog;
import Note.NotaMaterie;
import Note.NotaMaterieInfo;

public class InscriereaStudentului implements InscriereStudent{
    Catalog catalog;

    public InscriereaStudentului(Catalog catalog) {
        this.catalog = catalog;
    }
    @Override
    public void inscriere(String nume)
    {
        NotaMaterie nota=new NotaMaterieInfo();
        catalog.getCatalog().put(nume,nota);
    }
}
