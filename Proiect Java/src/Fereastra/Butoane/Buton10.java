package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;
import Persoane.Student;

import javax.swing.*;

public class Buton10 extends Buton{
    public Buton10(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume student:");
        JTextField inputNume = new JTextField();

        JButton cauta = new JButton("Cauta");

        stangaSus.add(labelNume);
        stangaSus.add(inputNume);

        stangaSus.add(cauta);

        stangaSus.revalidate();
        stangaSus.repaint();
        cauta.addActionListener(p -> {
            stangaSus.removeAll();
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
            //cautarea studentului
            Student student;
            if(nume.matches("\\d{5}"))
            {
                student = (Student) admin.getcautareStudentPrinNume().gasestePersoana(Integer.parseInt(nume));
            }
            else
            {
                student = (Student) admin.getcautareStudentPrinNume().gasestePersoana(nume);
            }

            //verificam daca studentul s-a gasit
            if(student==null)
            {
                jos.scriere("Studentul nu s-a gasit");
                actiuneButon();
                return;
            }
            //afisarea informatiilor
            JLabel text = new JLabel("Nume: " + student.getNume());
            stangaSus.add(text);
            text=new JLabel("\nCNP: " + student.getCNP());
            stangaSus.add(text);
            text=new JLabel("\nMail: "+student.getMail());
            stangaSus.add(text);
            text=new JLabel("\nAn: "+student.getAn());
            stangaSus.add(text);
            text=new JLabel("\nAn: "+student.getIdentificationNumber());
            stangaSus.add(text);
            text=new JLabel("\nCursuri: ");
            stangaSus.add(text);
            //pentru calvularea mediei studentului
            double media=0;
            int iterator=0;
            for (String cheie : admin.getCursuri().getCursuri().keySet())
            {
                if(admin.
                        getCursuri().
                        getCursuri().
                        get(cheie).
                        getCatalog().
                        getCatalog().
                        containsKey(student.getNume()))
                {
                    if(admin.
                            getCursuri().
                            getCursuri().
                            get(cheie).
                            getCatalog().
                            getCatalog().
                            get(student.
                                    getNume()).
                            getNota()!=null
                            && admin.
                            getCursuri().
                            getCursuri().
                            get(cheie).
                            getCatalog().
                            getCatalog().
                            get(student.
                                    getNume()).
                            getCredite()!=null)
                    {
                        text=new JLabel("Curs: "+cheie);
                        stangaSus.add(text);
                        text=new JLabel("\nNota:" +
                                + admin.getCursuri().
                                        getCursuri().
                                        get(cheie).
                                        getCatalog().
                                        getCatalog().
                                        get(student.
                                                getNume()).
                                        getNota().
                                        getNota());
                        stangaSus.add(text);
                        text=new JLabel(" credite: "+ admin.
                                getCursuri().
                                getCursuri().
                                get(cheie).
                                getCatalog().
                                getCatalog().
                                get(student.
                                        getNume()).
                                getCredite().
                                getCredite());
                        stangaSus.add(text);
                        media=media+admin.
                                getCursuri().
                                getCursuri().
                                get(cheie).
                                getCatalog().
                                getCatalog().
                                get(student.getNume()).getNota().getNota();
                        iterator++;
                    }
                    System.out.println();
                }
            }
            text=new JLabel("Media: "+ media/(double) iterator);
            stangaSus.add(text);
            stangaSus.revalidate();
            stangaSus.repaint();
        });

    }
}
