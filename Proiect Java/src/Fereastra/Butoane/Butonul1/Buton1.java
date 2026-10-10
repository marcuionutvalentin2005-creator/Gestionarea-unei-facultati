package Fereastra.Butoane.Butonul1;

import Admin.Adminul;
import Fereastra.Butoane.Buton;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton1 extends Buton {
    private FunctionalitateButonS1 functionalitateButonS1;
    public Buton1(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
        functionalitateButonS1=new FunctionalitateButonS1(admin,stangaSus,jos);
    }
    @Override
    public void actiuneButon()
    {
        //srierea in panoul de stanga sus

        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume:");
        JTextField inputNume = new JTextField();
        JLabel labelCNP = new JLabel("CNP:");
        JTextField inputCNP = new JTextField();

        JLabel labelMail = new JLabel("Mail:");
        JTextField inputMail = new JTextField();

        JLabel labelId = new JLabel("Grad:");
        JTextField inputGrad = new JTextField();

        JButton salveaza = new JButton("Salveaza");

        stangaSus.add(labelNume);
        stangaSus.add(inputNume);

        stangaSus.add(labelCNP);
        stangaSus.add(inputCNP);

        stangaSus.add(labelMail);
        stangaSus.add(inputMail);

        stangaSus.add(labelId);
        stangaSus.add(inputGrad);

        stangaSus.add(salveaza);

        stangaSus.revalidate();
        stangaSus.repaint();
        salveaza.addActionListener(p -> {
            functionalitateButonS1.activareButon(inputNume,inputCNP,inputMail,inputGrad);//functionalitate buton
            //revebire la inceput
            actiuneButon();
        });

    }

}
