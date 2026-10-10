package Fereastra.Butoane;

import javax.swing.*;

public class PopupEroare {
    public void eroare(JPanel stangaSus,String text)
    {
        JOptionPane.showMessageDialog(
                stangaSus,
                text,
                "Eroare",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
