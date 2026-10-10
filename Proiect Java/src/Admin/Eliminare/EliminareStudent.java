package Admin.Eliminare;

import Admin.Cautare.CautarePersoana;
import Cursuri.ListaCursuri;
import Persoane.Persoana.ListaPersoane;
import Persoane.Persoana.Persoana;

public class EliminareStudent implements EliminarePersoana{
    CautarePersoana cautare;
    ListaPersoane persoane;
    ListaCursuri cursuri;

    public EliminareStudent(CautarePersoana cautare, ListaPersoane persoane,ListaCursuri cursuri) {
        this.cautare = cautare;
        this.persoane=persoane;
        this.cursuri=cursuri;
    }
    @Override
    public void eliminare(String nume)
    {
        Persoana persoana=cautare.gasestePersoana(nume);
        if (persoana!=null)
        {
            for (String cheie: cursuri.getCursuri().keySet())
            {
                if(cursuri.getCursuri().get(cheie).getCatalog().getCatalog().containsKey(nume))
                {
                    cursuri.getCursuri().get(cheie).getCatalog().getCatalog().remove(nume);
                }
            }
            persoane.getPersoane().remove(persoana);
        }
        else
        {
            System.out.println("Studentul nu exista");
        }
    }
}
