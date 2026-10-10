package Fereastra.Butoane.Butonul2;

import Admin.Adminul;
import Fereastra.Butoane.Buton;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton2 extends Buton {
    private ButonSalvere2 butonSalvere2;
    public Buton2(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
        butonSalvere2=new ButonSalvere2(admin,stangaSus,jos);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume:");
        JTextField inputNume = new JTextField();

        JLabel labelCNP = new JLabel("CNP:");
        JTextField inputCNP = new JTextField();

        JLabel labelMail = new JLabel("Mail:");
        JTextField inputMail = new JTextField();

        JLabel labelAn = new JLabel("An:");
        JTextField inputAn= new JTextField();

        JLabel labelNumarMatricol = new JLabel("Numar Matricol:");
        JTextField inputNumarMatricol = new JTextField();

        JButton salveaza = new JButton("Salveaza");

        stangaSus.add(labelNume);
        stangaSus.add(inputNume);

        stangaSus.add(labelCNP);
        stangaSus.add(inputCNP);

        stangaSus.add(labelMail);
        stangaSus.add(inputMail);

        stangaSus.add(labelAn);
        stangaSus.add(inputAn);

        stangaSus.add(labelNumarMatricol);
        stangaSus.add(inputNumarMatricol);

        stangaSus.add(salveaza);

        stangaSus.revalidate();
        stangaSus.repaint();

        salveaza.addActionListener(p -> {
            butonSalvere2.salveaza(inputNume,inputCNP,inputMail,inputAn,inputNumarMatricol);
            actiuneButon();
        });
    }

}
