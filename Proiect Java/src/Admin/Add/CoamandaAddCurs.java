package Admin.Add;

import Admin.Cautare.CautarePersoana;
import Admin.Cautare.CautareaPersoaneiNume;
import Cursuri.Curs;
import Cursuri.Cursuri;
import Cursuri.ListaCursuri;
import Persoane.Persoana.ListaPersoane;
import Persoane.Profesor;

public class CoamandaAddCurs implements ComandAddCurs {
    Cursuri curs;
    AddCurs addCurs;
    CautarePersoana cautare;
    Profesor profesor;
    public CoamandaAddCurs(ListaCursuri lista, ListaPersoane persoane ) {
        this.addCurs = new AddCursurilor(lista);
        cautare=new CautareaPersoaneiNume(persoane);
    }
    @Override
    public void comandaAdaugariiCursurilor(String numeCurs,String numeProfesor)
    {
        profesor= (Profesor) cautare.gasestePersoana(numeProfesor);
        if (profesor!=null)
        {
            curs=new Curs(profesor);
            addCurs.adaugareCirs(numeCurs,curs);
        }
        else
        {
            System.out.println("Nu s-a gasit profesorul");
        }
    }

}
