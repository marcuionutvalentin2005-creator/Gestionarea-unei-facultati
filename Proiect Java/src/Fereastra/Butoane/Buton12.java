package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;
import Persoane.Profesor;

import javax.swing.*;

public class Buton12 extends Buton{
    public Buton12(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume:");
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
            Profesor profesor;
            if (nume.matches("\\d{5}"))
            {
                profesor=(Profesor) admin.getCautareProfesorPrinNume().gasestePersoana(Integer.parseInt(nume));//cautarea profesorului
            }
            else
            {
                profesor= (Profesor) admin.getCautareProfesorPrinNume().gasestePersoana(nume);//cautarea profesorului
            }
            //
            if(profesor==null)
            {
                jos.scriere("Profesorul nu s-a gasit");
                actiuneButon();
                return;
            }
            for(String cheie : admin.getCursuri().getCursuri().keySet())
            {
                if(admin.getCursuri().getCursuri().get(cheie).getProfesor().getNume().equals(nume))
                {
                    jos.scriere("Profesorul are cursuri, deci nu poate fi dat afara");
                    actiuneButon();
                    return;
                }

            }
            admin.getProfesori().getPersoane().remove(profesor);//actiune propriuzisa
           // admin.getEliminareProfesor().eliminare(nume);
            //de modificat
            jos.scriere("Actiunea a avut succes");
            actiuneButon();
        });

    }
}
