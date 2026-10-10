package Fereastra;

import javax.swing.*;

public class MesajePanouJos {
    private int numarator;
    private JPanel jos;

    public MesajePanouJos(JPanel jos) {
        this.numarator = 0;
        this.jos = jos;
    }
    public void scriere(String text)
    {
        //srierea in panoul de jos a reusitei actiunii
        JLabel text_=new JLabel(++numarator + ": "+ text);
        jos.add(text_);
        jos.revalidate();
        jos.repaint();
    }
}
