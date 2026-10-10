package Fereastra;

import Admin.Adminul;
import Fereastra.Butoane.*;
import Fereastra.Butoane.Butonul1.Buton1;
import Fereastra.Butoane.Butonul2.Buton2;
import Fereastra.Butoane.Butonul3.Buton3;
import Fereastra.Butoane.Butonul9.Buton9;

import javax.swing.*;

public class InitializareButoane {
    Adminul admin;
    JPanel stangaSus;
    MesajePanouJos jos;
    JPanel dreaptaSus;

    public InitializareButoane(Adminul admin, JPanel stangaSus, MesajePanouJos jos, JPanel dreaptaSus) {
        this.admin = admin;
        this.stangaSus = stangaSus;
        this.jos = jos;
        this.dreaptaSus = dreaptaSus;
    }

    public void initializare()
    {
        Buton boton1 = new Buton1(admin, stangaSus, jos,dreaptaSus,"Adauga profesor");
        Buton boton2 = new Buton2(admin, stangaSus, jos,dreaptaSus,"Adaugare student");
        Buton boton3 = new Buton3(admin, stangaSus, jos,dreaptaSus,"Adaugare curs");
        Buton boton4 = new Buton4(admin, stangaSus, jos,dreaptaSus,"Inscriere curs");
        Buton boton5 = new Buton5(admin, stangaSus, jos,dreaptaSus,"Evaluare student");
        Buton boton6 = new Buton6(admin, stangaSus, jos,dreaptaSus,"Lista profesorilor");
        Buton boton7 = new Buton7(admin, stangaSus, jos,dreaptaSus,"Lista studentilor");
        Buton boton8 = new Buton8(admin, stangaSus, jos,dreaptaSus,"Lista cursurilor");
        Buton boton9 = new Buton9(admin, stangaSus, jos,dreaptaSus,"Inspecteaza profesor");
        Buton boton10 = new Buton10(admin, stangaSus, jos,dreaptaSus,"Inspecteaza student");
        Buton boton11 = new Buton11(admin, stangaSus, jos,dreaptaSus,"Inspecteaza curs");
        Buton boton12 = new Buton12(admin, stangaSus, jos,dreaptaSus,"Elimina profesor");
        Buton boton13 = new Buton13(admin, stangaSus, jos,dreaptaSus,"Elimina student");
        Buton boton14 = new Buton14(admin, stangaSus, jos,dreaptaSus,"Elimina curs");
    }
}
