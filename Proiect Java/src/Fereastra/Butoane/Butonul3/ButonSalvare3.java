package Fereastra.Butoane.Butonul3;

import Admin.Adminul;
import Fereastra.Butoane.PopupEroare;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class ButonSalvare3 {
    private Adminul admin;
    private MesajePanouJos jos;
    private PopupEroare popupEroare;
    private JPanel stangaSus;
    public ButonSalvare3(Adminul admin, JPanel stangaSus, MesajePanouJos jos)
    {
        this.admin = admin;
        this.stangaSus = stangaSus;
        this.popupEroare =new PopupEroare();
        this.jos = jos;
    }
    public void salveaza(JTextField inputNumeCurs,
                         JTextField inputNumeProfesor)
    {
        //citeste casutele in forma de String fara spatii libere in stanga si dreapta
        String numeCurs = inputNumeCurs.getText().trim();
        String numeProfesor = inputNumeProfesor.getText().trim();
        //verifica daca Stringurile sunt goale
        if(numeCurs.isEmpty() || numeProfesor.isEmpty())
        {
            JOptionPane.showMessageDialog(
                    stangaSus,
                    "Te rog să completezi toate câmpurile!",
                    "Eroare",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        if(admin.getCautareProfesorPrinNume().gasestePersoana(numeProfesor)==null)
        {
            jos.scriere("Profesorul nu s-a gasit, deci cursul nu a fost creat");
            return;
        }
        if(admin.getCautareCurs().cautare(numeCurs)!=null)
        {
            jos.scriere("Acest curs dejea exista");
            return;
        }
        admin.getAddCurs().comandaAdaugariiCursurilor(numeCurs,numeProfesor);//crearea propriu zisa
        //srierea in panoul de jos a reusitei actiunii
        jos.scriere("Actiunea a avut succes!");
    }
}
