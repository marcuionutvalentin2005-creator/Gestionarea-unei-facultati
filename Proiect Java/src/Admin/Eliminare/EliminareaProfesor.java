package Admin.Eliminare;

import Admin.Cautare.CautarePersoana;
import Cursuri.ListaCursuri;
import Persoane.Persoana.ListaPersoane;
import Persoane.Persoana.Persoana;

public class EliminareaProfesor implements EliminarePersoana{
    CautarePersoana cautare;
    Persoana persoana;
    ListaPersoane persoane;
    ListaCursuri cursuri;
    public EliminareaProfesor(CautarePersoana cautare, ListaPersoane persoane,ListaCursuri cursuri) {
        this.cautare = cautare;
        this.persoane=persoane;
        this.cursuri=cursuri;
    }
    @Override
    public void eliminare(String nume)
    {
        persoana=cautare.gasestePersoana(nume);
        if (persoana!=null)
        {
            boolean areCurs=false;
            for(String cheie : cursuri.getCursuri().keySet())
            {
                if(cursuri.getCursuri().get(cheie).getProfesor().getNume().equals(nume))
                {
                    areCurs=true;
                }
            }
            if(areCurs==false)
            {
                persoane.getPersoane().remove(persoana);
            }
            else
            {
                System.out.println("Profesorul are cursuri, deci nu poate fi sters");
            }

        }
        else
        {
            System.out.println("Persoana nu exista");
        }
    }
}
