package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;
import Persoane.Student;

import javax.swing.*;

public class Buton13 extends Buton{
    public Buton13(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume Student:");
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
            //cautare
            Student student;
            if(nume.matches("\\d{5}"))
            {
                student = (Student) admin.getcautareStudentPrinNume().gasestePersoana(Integer.parseInt(nume));
            }
            else
            {
                student = (Student) admin.getcautareStudentPrinNume().gasestePersoana(nume);
            }
            //
            if (student==null)
            {
                jos.scriere("Studentul nu s-a gasit");
                actiuneButon();
                return;
            }
            admin.getStudenti().getPersoane().remove(student);//actiune propriuzisa
            //admin.getEliminareStudent().eliminare(nume);
            //de modificat
            jos.scriere("Actiunea a avut succes!");
            actiuneButon();
        });

    }
}
