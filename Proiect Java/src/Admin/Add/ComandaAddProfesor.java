package Admin.Add;

import Cursuri.ListaCursuri;
import Persoane.Persoana.ListaPersoane;
import Persoane.Persoana.Persoana;
import Persoane.Profesor;

public class ComandaAddProfesor implements ComandAddProfesori {
    private AddProfesor addProfesor;
    private Persoana persoana;
    private ListaCursuri cursuri;
    private ListaPersoane persoane;

    public ComandaAddProfesor(ListaPersoane persoane,ListaCursuri cursuri) {
        this.addProfesor = new AddPersoane(persoane);
        this.cursuri=cursuri;
    }
    @Override
    public void adaugaProfesori(String nume,String CNP,String mail,String grad, int numar)
    {
        //int numar;
        boolean stare=false;

           /* Random random = new Random();
            numar = 10000 + random.nextInt(90000);*/
            if(persoane!=null)
            {
                for(int i=0;i<persoane.getPersoane().size();i++)
                {
                    Profesor p=(Profesor)persoane.getPersoane().get(i);
                    if(numar==p.getIdentificationNumber())
                    {
                        stare=true;
                    }
                }
            }
        persoana=new Profesor(nume,numar,mail,CNP,grad);
        addProfesor.adaugaProfesori(persoana);
    }
}
