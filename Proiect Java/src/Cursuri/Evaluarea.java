package Cursuri;

import Catalog.Catalog;
import Note.Credite;
import Note.Creditele;
import Note.Nota;
import Note.NotaInfo;

public class Evaluarea implements Evaluare{
    Catalog catalog;

    public Evaluarea(Catalog catalog) {
        this.catalog = catalog;
    }
    @Override
    public void evaluare(String nume,double nota,int credite)
    {
        if(catalog.getCatalog().containsKey(nume))
        {
            Credite creditele=new Creditele(credite);
            Nota notaST=new NotaInfo(nota);
        if(catalog.getCatalog().get(nume).getNota()==null//verifica daca s-a pus nota
       ||catalog.getCatalog().get(nume).getCredite()==null )//verifica daca s-au pus creditele
            {
                catalog.getCatalog().get(nume).setNota(notaST);
                catalog.getCatalog().get(nume).setCredite(creditele);
            }
        else
        {
            catalog.getCatalog().get(nume).getNota().setNota(nota);
            catalog.getCatalog().get(nume).getCredite().setCredite(credite);
        }
        }
        else
        {
            System.out.println("Studentul nu participa la acest curs");
        }
    }
}
