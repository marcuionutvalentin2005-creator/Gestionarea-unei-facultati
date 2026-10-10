package Fereastra.Butoane;

import Admin.Adminul;
import Fereastra.MesajePanouJos;

import javax.swing.*;

public abstract  class Buton {
    protected Adminul admin;
    protected JPanel stangaSus;
    protected MesajePanouJos jos;

    public Buton(Adminul admin, JPanel stangaSus , MesajePanouJos jos,JPanel panel,String name) {
        JButton b1 = new JButton(name);
        panel.add(b1);
        b1.addActionListener(e -> {actiuneButon();});
        this.admin = admin;
        this.stangaSus = stangaSus;
        this.jos=jos;
    }
    public abstract void actiuneButon();
}
