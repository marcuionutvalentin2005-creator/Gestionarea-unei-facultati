package Cursuri;

import java.util.HashMap;

public class ListaCursurilor implements ListaCursuri{
    private HashMap<String, Cursuri>cursuri;

    public ListaCursurilor() {
        this.cursuri = new HashMap<>();
    }
@Override
    public HashMap<String, Cursuri> getCursuri() {
        return cursuri;
    }
}
