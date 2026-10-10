package Fereastra.Butoane.Butonul9;

import Admin.Adminul;
import Fereastra.MesajePanouJos;
import Persoane.Profesor;

import javax.swing.*;

public class ButonCautare {
    private Adminul admin;
    private MesajePanouJos jos;
    private Afisarea afisarea;
    private JPanel stangaSus;
    private Buton9 buton9;

    public ButonCautare(Adminul admin, MesajePanouJos jos, JPanel stangaSus, Buton9 buton9) {
        this.admin = admin;
        this.jos = jos;
        this.stangaSus = stangaSus;
        this.buton9=buton9;
        this.afisarea=new Afisarea(stangaSus,admin);
    }

    public void  activareButon(JTextField inputNume)
    {
        stangaSus.removeAll();

        String nume = inputNume.getText().trim();/*se citeste casuta cu un String cu spatiile limare
                                                       din dreapta si din stanga eliminate*/
        //verifica daca Stringul sunt goal
        if(nume.isEmpty())
        {
            JOptionPane.showMessageDialog(
                    stangaSus,
                    "Te rog să completezi campul!",
                    "Eroare",
                    JOptionPane.ERROR_MESSAGE
            );
            buton9.actiuneButon();
            return;
        }
        Profesor profesor;
        if (nume.matches("\\d{5}"))
        {
            profesor=(Profesor) admin.getCautareProfesorPrinNume().gasestePersoana(Integer.parseInt(nume));//cautarea profesorului
        }
        else
        {
            profesor= (Profesor) admin.getCautareProfesorPrinNume().gasestePersoana(nume);//cautarea profesorului
        }
        if(profesor==null)
        {
            jos.scriere("Profesorul nu s-a gasit");
            buton9.actiuneButon();
            return;
        }
        afisarea.afisare(profesor,nume);
        jos.scriere("Actiunea a vut succes!");
        stangaSus.revalidate();
        stangaSus.repaint();
    }
}
