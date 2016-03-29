
import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LuvutJarjestyksessaHiddenTest {

    @Test
    @Points("1")
    public void testaaLuvutJarjestyksessa() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    boolean palautus = LuvutJarjestyksessa.luvutJarjestyksessa(i, j, k);

                    boolean odotettu = luvutJarjestyksessa(i, j, k);

                    assertEquals("Testaa ohjelmasi toimintaa kutsulla luvutJarjestyksessa(" + i + ", " + j + ", " + k + ").", odotettu, palautus);

                }
            }
        }
    }

    private static boolean luvutJarjestyksessa(int eka, int toka, int kolmas) {
        // STUB: return false;
        // BEGIN SOLUTION
        if (eka <= toka && toka <= kolmas) {
            return true;
        }

        if (eka >= toka && toka >= kolmas) {
            return true;
        }

        return false;
        // END SOLUTION
    }
}
