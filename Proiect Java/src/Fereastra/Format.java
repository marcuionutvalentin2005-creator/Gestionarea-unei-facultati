package Fereastra;

import Admin.Adminul;
import Fereastra.Butoane.*;

import javax.swing.*;
//de scos repetarea butoanelor si sa fac o clasa abstracta pentru butoane
public class Format {
    Adminul admin;//=new Adminul();

    public Format(Adminul admin) {
        this.admin = admin;
    }
    public void formatare()
    {
        SwingUtilities.invokeLater(() ->
        {

            JFrame frame = new JFrame("Gestionarea facultatii");

            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            // Panouri
            JPanel stangaSus = new JPanel();
            JPanel dreaptaSus = new JPanel();
            JPanel jos = new JPanel();

            // =========================
            // BUTOANE
            // =========================
            MesajePanouJos jos_=new MesajePanouJos(jos);
            InitializareButoane butoane=new InitializareButoane(admin,stangaSus,jos_,dreaptaSus);
            butoane.initializare();

            dreaptaSus.setLayout(new BoxLayout(dreaptaSus, BoxLayout.Y_AXIS));//le face sa fie scrise una sub alta
            stangaSus.setLayout(new BoxLayout(stangaSus, BoxLayout.Y_AXIS));//le face sa fie scrise una sub alta
            jos.setLayout(new BoxLayout(jos, BoxLayout.Y_AXIS));//le face sa fie scrise una sub alta

            // =========================
            // SCROLL
            // =========================

            JScrollPane scroll1 = new JScrollPane(dreaptaSus);
            JScrollPane scroll2 = new JScrollPane(stangaSus);
            JScrollPane scroll3 = new JScrollPane(jos);
            // =========================
            // SPLIT STÂNGA / DREAPTA
            // =========================

            JSplitPane sus = new JSplitPane(
                    JSplitPane.HORIZONTAL_SPLIT,
                    scroll2,
                    scroll1       // IMPORTANT: scroll, nu dreaptaSus
            );

            sus.setDividerLocation(600);

            // =========================
            // SPLIT SUS / JOS
            // =========================

            JSplitPane principal = new JSplitPane(
                    JSplitPane.VERTICAL_SPLIT,
                    sus,
                    scroll3
            );
            //
            principal.setDividerLocation(400);

            // Adăugăm totul în fereastră
            frame.add(principal);

            frame.setVisible(true);
        });
    }
}
