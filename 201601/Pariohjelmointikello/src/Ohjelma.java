
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ohjelma {

    public static void main(String[] args) throws Exception {
        // tätä ohjelmaa käytetään ajajan, eli koodia kirjoittavan ohjelmoijan
        // vaihtamiseen
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("pariohjelmointi-vaihdot.txt"), true));

        while (true) {

            JFrame frame = new JFrame("Ois niinku aika vaihtaa ohjelmoijaa.");
            String name = JOptionPane.showInputDialog(frame, "Vaihto! Kirjoita näppäimistölle tulevan ohjelmoijan tunnus.");

            pw.println(new Date() + " swap performed, programmer now: " + name);
            pw.flush();

            try {
                Thread.sleep(1000 * 60 * 7); // odotetaan 5 minuuttia.
            } catch (InterruptedException ex) {
            }
        }
    }

}
