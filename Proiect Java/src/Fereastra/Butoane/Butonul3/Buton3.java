package Fereastra.Butoane.Butonul3;


import Admin.Adminul;
import Fereastra.Butoane.Buton;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton3 extends Buton {
    private  ButonSalvare3 butonSalvare3;
    public Buton3(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
        butonSalvare3=new ButonSalvare3(admin,stangaSus,jos);
    }
    @Override
    public void actiuneButon() {
        stangaSus.removeAll();
        JLabel labelNumeCurs = new JLabel("Numele Cursului:");
        JTextField inputNumeCurs = new JTextField();

        JLabel labelNumeProfesor = new JLabel("Numele Profesorului:");
        JTextField inputNumeProfesor = new JTextField();

        JButton salveaza = new JButton("Salveaza");

        stangaSus.add(labelNumeCurs);
        stangaSus.add(inputNumeCurs);

        stangaSus.add(labelNumeProfesor);
        stangaSus.add(inputNumeProfesor);

        stangaSus.add(salveaza);

        stangaSus.revalidate();
        stangaSus.repaint();

        salveaza.addActionListener(p -> {
            butonSalvare3.salveaza(inputNumeCurs,inputNumeProfesor);
            //revebire la inceput
            actiuneButon();
        });
    }
}
