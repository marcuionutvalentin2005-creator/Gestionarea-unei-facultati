package Admin.Add;

import Persoane.Persoana.ListaPersoane;
import Persoane.Persoana.Persoana;

public class AddPersoane implements AddProfesor {
    ListaPersoane persoana;

    public AddPersoane(ListaPersoane persoana_) {
        this.persoana = persoana_;
    }
    @Override
    public void adaugaProfesori(Persoana persoana_)
    {
        persoana.getPersoane().add(persoana_);
    }
}
