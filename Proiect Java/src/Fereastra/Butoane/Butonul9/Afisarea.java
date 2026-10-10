package Fereastra.Butoane.Butonul9;

import Admin.Adminul;
import Persoane.Profesor;

import javax.swing.*;

public class Afisarea {
    private  JPanel stangaSus;
    private Adminul admin;

    public Afisarea(JPanel stangaSus, Adminul admin) {
        this.stangaSus = stangaSus;
        this.admin = admin;
    }

    public  void afisare(Profesor profesor,String nume)
    {
        //afisarea datelor lui
        JLabel text = new JLabel("Nume: " + profesor.getNume());
        stangaSus.add(text);
        text=new JLabel("\nCNP: " + profesor.getCNP());
        stangaSus.add(text);
        text=new JLabel("\nMail: "+profesor.getMail());
        stangaSus.add(text);
        text=new JLabel("\nGrad: "+profesor.getGrad());
        stangaSus.add(text);
        text=new JLabel("\nNumar de indentificare: "+profesor.getIdentificationNumber());
        stangaSus.add(text);
        text=new JLabel("\nCursuri: ");
        stangaSus.add(text);
        for(String cheie : admin.getCursuri().getCursuri().keySet())
        {
            if(admin.getCursuri().getCursuri().get(cheie).getProfesor().getNume().equals(nume))
            {
                text=new JLabel("\n"+cheie);
                stangaSus.add(text);
            }
        }
    }
}
