
import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LuvutJarjestyksessaTest {

    @Test
    @Points("1")
    public void epaJarjestyksessaPalauttaaFalse() {
        assertFalse("Testaa ohjelmasi toimintaa kutsulla luvutJarjestyksessa(15, 3, 28).", LuvutJarjestyksessa.luvutJarjestyksessa(15, 3, 28));
    }

    @Test
    @Points("1")
    public void jarjestyksessaPalauttaaTrue() {
        assertTrue("Testaa ohjelmasi toimintaa kutsulla luvutJarjestyksessa(3, 15, 28).", LuvutJarjestyksessa.luvutJarjestyksessa(3, 15, 28));
    }

    @Test
    @Points("1")
    public void kaanteisessaJarjestyksessaPalauttaaTrue() {
        assertTrue("Testaa ohjelmasi toimintaa kutsulla luvutJarjestyksessa(28, 15, 5).", LuvutJarjestyksessa.luvutJarjestyksessa(28, 15, 5));
    }

}
