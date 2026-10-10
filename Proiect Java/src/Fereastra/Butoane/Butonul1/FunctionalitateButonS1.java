package Fereastra.Butoane.Butonul1;

import Admin.Adminul;
import Fereastra.Butoane.PopupEroare;
import Fereastra.Butoane.RandomNr;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class FunctionalitateButonS1 {
    private Adminul admin;
    private MesajePanouJos jos;
    private PopupEroare popupEroare;
    private JPanel stangaSus;
    private RandomNr randomNr;
    public FunctionalitateButonS1(Adminul admin, JPanel stangaSus, MesajePanouJos jos)
    {
        this.admin = admin;
        this.stangaSus = stangaSus;
        this.popupEroare =new PopupEroare();
        this.jos = jos;
        randomNr=new RandomNr();
    }

    public void activareButon(JTextField inputNume,
                              JTextField inputCNP,
                              JTextField inputMail,
                              JTextField inputGrad)
    {
        //citeste casutele in forma de String fara spatii libere in stanga si dreapta
        String nume = inputNume.getText().trim();
        String cnpText = inputCNP.getText().trim();
        String mail = inputMail.getText().trim();
        String grad = inputGrad.getText().trim();
        //verifica daca Stringurile sunt goale
        if (nume.isEmpty() || cnpText.isEmpty() || mail.isEmpty() || grad.isEmpty()) {
            popupEroare.eroare(stangaSus,"Te rog să completezi toate câmpurile!");
            return;
        }
        // Verifică CNP-ul
        if (!cnpText.matches("\\d{13}")) {
            popupEroare.eroare(stangaSus,"CNP-ul trebuie să conțină exact 13 cifre!");
            return;
        }
        //de modificat
        int nr;//de imbunatatit si pt strudenti, cu clase diferite
        while (true)
        {
             nr=randomNr.random();
            if(admin.getCautareProfesorPrinNume().gasestePersoana(String.valueOf(nr))==null) ;
            {
                break;
            }
        }
        admin.getAddProfesori().adaugaProfesori(nume, cnpText ,mail , grad,nr);//actiunea de adaugare a Profesorului

        //srierea in panoul de jos a reusitei actiunii
        jos.scriere("Actiunea a avut succes!");
    }
}
