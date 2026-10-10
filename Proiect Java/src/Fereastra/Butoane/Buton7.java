package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton7 extends Buton{
    public Buton7(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel text=new JLabel("Studenti: ");
        stangaSus.add(text);
        for(int i=0;i<admin.getStudenti().getPersoane().size();i++)
        {
            text=new JLabel(admin.getStudenti().getPersoane().get(i).getNume());
            stangaSus.add(text);
        }
        stangaSus.revalidate();
        stangaSus.repaint();
    }
}
