package Admin.Eliminare;

import Cursuri.ListaCursuri;

public class EliminareaCursului implements EliminareCurs{
    ListaCursuri cursuri;//este un hasmap cu toate cursurile, cheile sunt numele cursurilor

    public EliminareaCursului(ListaCursuri cursuri) {
        this.cursuri = cursuri;
    }
@Override
    public void elimina(String nume)
    {
        cursuri.getCursuri().remove(nume);//cauta si sterge cursul
    }
}
