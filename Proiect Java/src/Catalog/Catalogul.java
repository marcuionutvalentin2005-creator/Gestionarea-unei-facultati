package Catalog;

import Note.NotaMaterie;

import java.util.HashMap;

public class Catalogul implements Catalog{
    private HashMap<String, NotaMaterie> catalog;

    public Catalogul() {
        this.catalog = new HashMap<>();
    }
@Override
    public HashMap<String, NotaMaterie> getCatalog() {
        return catalog;
    }
}
