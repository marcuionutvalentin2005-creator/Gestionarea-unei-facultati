package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;
import Persoane.Profesor;

import javax.swing.*;

public class Buton6 extends Buton{
    public Buton6(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel text=new JLabel("Profesori: ");
        stangaSus.add(text);
        for(int i=0;i<admin.getProfesori().getPersoane().size();i++)
        {
            Profesor p=(Profesor)admin.getProfesori().getPersoane().get(i);
            text=new JLabel(p.getIdentificationNumber()+"   "+p.getNume());
            stangaSus.add(text);

        }
        stangaSus.revalidate();
        stangaSus.repaint();
    }
}
