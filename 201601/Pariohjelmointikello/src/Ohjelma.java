
import javax.swing.JOptionPane;

public class Ohjelma {

    public static void main(String[] args) {
        // tätä ohjelmaa käytetään ajajan, eli koodia kirjoittavan ohjelmoijan
        // vaihtamiseen

        while (true) {
            JOptionPane.showMessageDialog(null, "Ois niinku aika vaihtaa ohjelmoijaa.", "Aika!", JOptionPane.WARNING_MESSAGE);

            try {
                Thread.sleep(1000 * 60 * 5); // odotetaan 5 minuuttia.
            } catch (InterruptedException ex) {
            }
        }

    }

}
