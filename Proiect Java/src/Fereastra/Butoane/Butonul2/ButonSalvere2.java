package Fereastra.Butoane.Butonul2;

import Admin.Adminul;
import Fereastra.Butoane.PopupEroare;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class ButonSalvere2 {
    private Adminul admin;
    private MesajePanouJos jos;
    private PopupEroare popupEroare;
    private JPanel stangaSus;
    public ButonSalvere2(Adminul admin, JPanel stangaSus, MesajePanouJos jos)
    {
        this.admin = admin;
        this.stangaSus = stangaSus;
        this.popupEroare =new PopupEroare();
        this.jos = jos;
    }
    public void salveaza(JTextField inputNume,
                         JTextField inputCNP,
                         JTextField inputMail,
                         JTextField inputAn,
                         JTextField inputNumarMatricol)
    {
        //citeste casutele in forma de String fara spatii libere in stanga si dreapta
        String nume = inputNume.getText().trim();
        String cnpText = inputCNP.getText().trim();
        String mail = inputMail.getText().trim();
        String anText = inputAn.getText().trim();
        String numarMatricolText = inputNumarMatricol.getText().trim();
        //verifica daca Stringurile sunt goale
        if(nume.isEmpty() || cnpText.isEmpty() || mail.isEmpty() || anText.isEmpty() || numarMatricolText.isEmpty())
        {
            popupEroare.eroare(stangaSus,"Te rog să completezi toate câmpurile!");
            return;
        }
        // Verifică CNP-ul
        if (!cnpText.matches("\\d{13}")) {
            popupEroare.eroare(stangaSus,"CNP-ul trebuie să conțină exact 13 cifre!");
            return;
        }
        int an,numarMatricol;
        try {//verifica daca cnp,an si numarMatricol sunt dee forma int
            an=Integer.parseInt(anText);
            numarMatricol=Integer.parseInt(numarMatricolText);
        } catch (NumberFormatException e ) {
            popupEroare.eroare(stangaSus,"Anul si numarul matricol trebuie să conțină doar cifre!");
            return;
        }
        admin.getAddStudent().adaugaStudent(nume, cnpText,mail , an , numarMatricol);//crearea propriu zisa
        //srierea in panoul de jos a reusitei actiunii
        jos.scriere("Actiunea a avut succes!");
    }
}
