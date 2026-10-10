package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton14 extends Buton{
    public Buton14(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume Curs:");
        JTextField inputNume = new JTextField();

        JButton sterge = new JButton("Sterge");

        stangaSus.add(labelNume);
        stangaSus.add(inputNume);

        stangaSus.add(sterge);

        stangaSus.revalidate();
        stangaSus.repaint();
        sterge.addActionListener(p -> {

            //se citeste casuta cu un String cu spatiile limare din dreapta si din stanga eliminate
            String nume = inputNume.getText().trim();
            //verifica daca Stringul sunt goal
            if(nume.isEmpty())
            {
                JOptionPane.showMessageDialog(
                        stangaSus,
                        "Te rog să completezi campul!",
                        "Eroare",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            if (admin.getCautareCurs().cautare(nume)==null)
            {
                jos.scriere("Cursul nu s-a gasit");
                actiuneButon();
                return;
            }
            admin.getEliminareCurs().elimina(nume);//actiune propriuzisa
            jos.scriere("Actiunea a avut succes!");
            actiuneButon();
        });

    }
}
