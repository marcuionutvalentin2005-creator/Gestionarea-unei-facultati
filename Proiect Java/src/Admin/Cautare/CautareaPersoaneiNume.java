package Admin.Cautare;

import Persoane.Persoana.ListaPersoane;
import Persoane.Persoana.Persoana;

import static javax.swing.UIManager.get;

public class CautareaPersoaneiNume implements CautarePersoana {
    private ListaPersoane persoane;

    public CautareaPersoaneiNume(ListaPersoane persoane) {
        this.persoane = persoane;
    }
    @Override
    public Persoana gasestePersoana(String nume)
    {
        for(int i=0;i<persoane.getPersoane().size();i++)
        {
            if(persoane.getPersoane().get(i).getNume().equals(nume))
            {
                return persoane.getPersoane().get(i);
            }
        }
        return null;
    }
    @Override
    public Persoana gasestePersoana(int nr)
    {
        for(int i=0;i<persoane.getPersoane().size();i++)
        {
            if(persoane.getPersoane().get(i).getIdentificationNumber()==nr)
            {
                return persoane.getPersoane().get(i);
            }
        }
        return null;
    }
}
