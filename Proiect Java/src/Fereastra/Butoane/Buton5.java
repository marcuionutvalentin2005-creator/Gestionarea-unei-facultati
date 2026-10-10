package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public class Buton5 extends Buton{
    public Buton5(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel panel, String name) {
        super(admin, stangaSus, jos, panel, name);
    }
    @Override
    public void actiuneButon() {
        stangaSus.removeAll();
        JLabel labelNumeCurs = new JLabel("Numele Cursului:");
        JTextField inputNumeCurs = new JTextField();

        JLabel labelNumeStudent = new JLabel("Numele Studentului:");
        JTextField inputNumeStudent = new JTextField();

        JLabel labelNota = new JLabel("Nota:");
        JTextField inputNota = new JTextField();

        JLabel labelCredite = new JLabel("Credite:");
        JTextField inputCredite = new JTextField();

        JButton salveaza = new JButton("Salveaza");

        stangaSus.add(labelNumeCurs);
        stangaSus.add(inputNumeCurs);

        stangaSus.add(labelNumeStudent);
        stangaSus.add(inputNumeStudent);

        stangaSus.add(labelNota);
        stangaSus.add(inputNota);

        stangaSus.add(labelCredite);
        stangaSus.add(inputCredite);

        stangaSus.add(salveaza);

        stangaSus.revalidate();
        stangaSus.repaint();

        salveaza.addActionListener(p -> {
            //citeste casutele in forma de String fara spatii libere in stanga si dreapta
            String numeCurs = inputNumeCurs.getText().trim();
            String numeStudent = inputNumeStudent.getText().trim();
            String notaText = inputNota.getText().trim();
            String crediteText = inputCredite.getText().trim();
            //verifica daca Stringurile sunt goale
            if(numeCurs.isEmpty() || numeStudent.isEmpty()||notaText.isEmpty()||crediteText.isEmpty())
            {
                JOptionPane.showMessageDialog(
                        stangaSus,
                        "Te rog să completezi toate câmpurile!",
                        "Eroare",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            int credite;
            double nota;
            try {//verifica daca cnp este de forma int
                credite = Integer.parseInt(crediteText);
                nota=Double.parseDouble(notaText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        stangaSus,
                        "Creditele trebuie să conțină doar cifre intregi!\nNota trebuie sa contina doar numere!",
                        "Eroare",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            if(admin.getcautareStudentPrinNume().gasestePersoana(numeStudent)==null//verifica daca exista studentul
                ||
               admin.getCautareCurs().cautare(numeCurs)==null)//verifica daca exista cursul
            {
                jos.scriere("Cursul sau studentul nu s-au gasit");
            }
            else {
                if(nota<1 || nota>10 || credite<0)
                {
                    jos.scriere("Nota si/sau numarul de credite au fost modificate" +
                            "\n pentru a se potrivi in parametri necesari");
                }
                else {
                    jos.scriere("Actiunea a avut succes!");
                }
                nota=(nota>=1)? nota:1;
                nota=(nota<10)? nota:10;
                credite=(credite>0)? credite:0;

                admin.getEvaluare().evaluare(numeCurs,numeStudent,nota,credite);//acriunea propriuzisa
            }
            actiuneButon();
        });
    }
}
