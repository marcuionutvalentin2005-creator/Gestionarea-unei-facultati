package Admin.InscriereEvaluare;

import Admin.Cautare.CautareCurs;
import Admin.Cautare.CautareaPersoaneiNume;
import Cursuri.Cursuri;
import Persoane.Persoana.Persoana;

public class InscriereaStudentuui implements InscriereStudent{
    CautareCurs curs;
    CautareaPersoaneiNume persoana;
    public InscriereaStudentuui(CautareCurs curs, CautareaPersoaneiNume persoana) {
        this.curs = curs;
        this.persoana=persoana;
    }
    @Override
    public void inscriere(String numeCurs,String numeStudent)
    {
        Cursuri c=curs.cautare(numeCurs);
        if(c!=null)
        {
            Persoana p=persoana.gasestePersoana(numeStudent);
            if(p!=null)
            {
                c.getInscriere().inscriere(numeStudent);
            }
            else {
                System.out.println("Studentul nu exista");
            }
        }
        else
        {
            System.out.println("Cursul nu exista");
        }
    }
}
