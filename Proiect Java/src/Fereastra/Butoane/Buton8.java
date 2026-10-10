package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton8 extends Buton{
    public Buton8(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel text=new JLabel("Cursuri: ");
        stangaSus.add(text);
        for(String cheie: admin.getCursuri().getCursuri().keySet())
        {
            text=new JLabel(cheie);
            stangaSus.add(text);
        }
        stangaSus.revalidate();
        stangaSus.repaint();
    }
}
