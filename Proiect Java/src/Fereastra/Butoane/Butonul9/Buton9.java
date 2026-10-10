package Fereastra.Butoane.Butonul9;

import Admin.Adminul;
import Fereastra.Butoane.Buton;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton9 extends Buton {
    private ButonCautare cautarea;
    public Buton9(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
        cautarea=new ButonCautare(admin,jos,stangaSus,this);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume profesor:");
        JTextField input = new JTextField();

        JButton cauta = new JButton("Cauta");

        stangaSus.add(labelNume);
        stangaSus.add(input);

        stangaSus.add(cauta);

        stangaSus.revalidate();
        stangaSus.repaint();
        cauta.addActionListener(p -> {
            cautarea.activareButon(input);
        });

    }
}
