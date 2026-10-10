package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton11 extends Buton{
    public Buton11(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon()
    {
        stangaSus.removeAll();
        JLabel labelNume = new JLabel("Nume curs:");
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
            if((admin.getCautareCurs().cautare(nume)==null)? false : true)//verifica daca cursul exista
            {
                //afisarea datelor
                JLabel text = new JLabel("Nume Curs: " + nume);
                stangaSus.add(text);
                text = new JLabel("Nume Titular: " +
                        admin.
                        getCautareCurs().
                        cautare(nume).
                        getProfesor().
                        getNume());
                stangaSus.add(text);
                text = new JLabel("Studenti: ");
                stangaSus.add(text);
                for(String cheie: admin.getCursuri().getCursuri().get(nume).getCatalog().getCatalog().keySet())//toti elevi
                {
                    System.out.print(cheie);
                    text = new JLabel(cheie+": ");
                    stangaSus.add(text);
                    if((admin.
                            getCursuri().
                            getCursuri().
                            get(nume).
                            getCatalog().getCatalog().get(cheie).getNota()!=null)//daca nota nu este null
                            &&
                            admin.
                                    getCursuri().
                                    getCursuri().
                                    get(nume).
                                    getCatalog().
                                    getCatalog().
                                    get(cheie).
                                    getCredite()!=null)//faca creditele nu sunt null
                    {
                        text = new JLabel("   nota: " + admin.
                                getCursuri().
                                getCursuri().
                                get(nume).
                                getCatalog().
                                getCatalog().
                                get(cheie).
                                getNota().
                                getNota()
                                + "   credite: "+
                                admin.
                                getCursuri().
                                getCursuri().
                                get(nume).
                                getCatalog().
                                getCatalog().
                                        get(cheie).
                                        getCredite().
                                        getCredite());
                        stangaSus.add(text);
                    }
                }
            }
            else//daca nu exista cursul
            {
                jos.scriere("Cursul nu s-a gasit");
            }
            stangaSus.revalidate();
            stangaSus.repaint();
        });

    }
}
