
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Ohjelma {

    public static void main(String[] args) throws Exception {
        // tätä ohjelmaa käytetään ajajan, eli koodia kirjoittavan ohjelmoijan
        // vaihtamiseen
        PrintWriter pw = new PrintWriter("swaps.txt");

        while (true) {
            JOptionPane.showMessageDialog(null, "Ois niinku aika vaihtaa ohjelmoijaa.", "Aika!", JOptionPane.WARNING_MESSAGE);
            pw.println(new Date() + " swap performed.");

            try {
                Thread.sleep(1000 * 60 * 5); // odotetaan 5 minuuttia.
            } catch (InterruptedException ex) {
            }
        }

    }

}
