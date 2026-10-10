package Admin.Add;

import Cursuri.Cursuri;
import Cursuri.ListaCursuri;

public class AddCursurilor implements AddCurs {
    //este o cala care contine un Hasmap cu toate cursurile.
    ListaCursuri lista;

    public AddCursurilor(ListaCursuri lista) {
        this.lista = lista;
    }
    @Override
    public void adaugareCirs(String nume,Cursuri curs)
    {
        lista.getCursuri().put(nume,curs);
    }
}
