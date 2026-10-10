package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton4 extends Buton{
    public Buton4(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon() {
        stangaSus.removeAll();
        JLabel labelNumeCurs = new JLabel("Numele Cursului:");
        JTextField inputNumeCurs = new JTextField();

        JLabel labelNumeStudent = new JLabel("Numele Studentului:");
        JTextField inputNumeStudent = new JTextField();

        JButton salveaza = new JButton("Salveaza");

        stangaSus.add(labelNumeCurs);
        stangaSus.add(inputNumeCurs);

        stangaSus.add(labelNumeStudent);
        stangaSus.add(inputNumeStudent);

        stangaSus.add(salveaza);

        stangaSus.revalidate();
        stangaSus.repaint();

        salveaza.addActionListener(p -> {
            //citeste casutele in forma de String fara spatii libere in stanga si dreapta
            String numeCurs = inputNumeCurs.getText().trim();
            String numeStudent = inputNumeStudent.getText().trim();
            //verifica daca Stringurile sunt goale
            if(numeCurs.isEmpty() || numeStudent.isEmpty())
            {
                JOptionPane.showMessageDialog(
                        stangaSus,
                        "Te rog să completezi toate câmpurile!",
                        "Eroare",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            if(admin.getcautareStudentPrinNume().gasestePersoana(numeStudent)==null //verifica daca exista studentul
                 || admin.getCautareCurs().cautare(numeCurs)==null//verifica daca exista cursyl
            )
            {
                //srierea in panoul de jos
                jos.scriere("Studentul si / sau cursul nu exista!");
                actiuneButon();
                return;
            }
            if(admin.getCautareCurs().cautare(numeCurs).getCatalog().getCatalog().get(numeStudent)!=null)
            {
                jos.scriere("Studentul e dejea inscris la acrst curs!");
                actiuneButon();
                return;
            }
            admin.getInscriereStudent().inscriere(numeCurs, numeStudent);//inscrierea efectiva
            //srierea in panoul de jos a reusitei actiunii
            jos.scriere("Actiunea a avut succes!");
            //revenire la inceput
            actiuneButon();
        });
    }
}
