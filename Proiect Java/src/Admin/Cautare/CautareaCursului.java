package Admin.Cautare;

import Cursuri.Cursuri;
import Cursuri.ListaCursuri;

public class CautareaCursului implements CautareCurs {
    ListaCursuri lita;//este un hasmap cu toate cursurile, cheile sunt numele cursurilor

    public CautareaCursului(ListaCursuri lita) {
        this.lita = lita;
    }
    @Override
    public Cursuri cautare(String nume)
    {
       return lita.getCursuri().get(nume);//cautam si returnam cursul
    }
}
