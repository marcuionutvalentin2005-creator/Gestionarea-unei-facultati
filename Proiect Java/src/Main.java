import Admin.Adminul;
import Fereastra.Butoane.*;
import Fereastra.Format;

import javax.swing.*;
/*
Acest proiect inca nu este in versiunea s-a finala!
*/
public class Main {

    public static void main(String[] args) {
        Adminul admin=new Adminul();
        //inceput test
        admin.getAddProfesori().adaugaProfesori("profu","123","mail","mare",12345);
        admin.getAddProfesori().adaugaProfesori("profa","333","mmmail","tare",54321);
        admin.getAddStudent().adaugaStudent("mimi","122","mail2",2,78);
        admin.getAddStudent().adaugaStudent("gigi","222","mail3",1,90);
        admin.getAddCurs().comandaAdaugariiCursurilor("mate","profu");
        admin.getAddCurs().comandaAdaugariiCursurilor("Inginerie","profa");
        admin.getInscriereStudent().inscriere("Inginerie","mimi");
        admin.getInscriereStudent().inscriere("mate","mimi");
        admin.getInscriereStudent().inscriere("Inginerie","gigi");
        admin.getInscriereStudent().inscriere("mate","gigi");
        admin.getEvaluare().evaluare("Inginerie","mimi",9,4);
        admin.getEvaluare().evaluare("mate","mimi",10,5);
        admin.getEvaluare().evaluare("mate","gigi",10,5);
        //sfarsit test
        Format format=new Format(admin);
        format.formatare();
    }
}