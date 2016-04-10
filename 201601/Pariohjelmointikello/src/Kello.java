
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Kello {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd'T'HHmmss");

    public static void kaynnista() throws Exception {
        // tätä ohjelmaa käytetään ajajan, eli koodia kirjoittavan ohjelmoijan
        // vaihtamiseen
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("pariohjelmointi-vaihdot.txt"), true));

        while (true) {

            JFrame frame = new JFrame("Ois niinku aika vaihtaa ohjelmoijaa.");
            frame.setAlwaysOnTop(true);
            frame.setVisible(true);
            String name = JOptionPane.showInputDialog(frame, "Kirjoita näppäimistölle tulevan ohjelmoijan tunnus (esim. 01).", "Ois niinku aika vaihtaa ohjelmoijaa.", JOptionPane.WARNING_MESSAGE);

            try {
                frame.dispose();
            } catch (Throwable t) {

            }

            if (name == null || name.length() != 2) {
                JFrame jframe = new JFrame("Ois niinku aika vaihtaa ohjelmoijaa.");

                jframe.setAlwaysOnTop(true);
                jframe.setVisible(true);

                JOptionPane.showMessageDialog(jframe, "Kirjoita näppäimistölle tulevan ohjelmoijan tunnus.");

                try {
                    frame.dispose();
                } catch (Throwable t) {
                }
            } else {
                pw.println(SDF.format(new Date()) + " swap performed, programmer now: " + name);
                pw.flush();

                try {
                    Thread.sleep(1000 * 60 * 7); // odotetaan 7 minuuttia.
                } catch (InterruptedException ex) {
                }
                pw.println(SDF.format(new Date()) + " swap going to be performed, programmer was: " + name);
                pw.flush();
            }
        }
    }
}
