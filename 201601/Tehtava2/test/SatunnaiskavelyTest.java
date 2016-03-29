
import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import static java.lang.System.out;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Rule;
import org.junit.Test;

public class SatunnaiskavelyTest {

    @Rule
    public MockStdio io = new MockStdio();

    @Test
    @Points("2")
    public void satunnaisKavelyYhdellaAskeleella() {
        Satunnaiskavely.satunnaiskavely(0, 0, 1);
        String[] lines = io.getSysOut().trim().split("\n");
        assertTrue("Kun kutsuttiin satunnaiskavely(0, 0, 1), odotettiin että ensimmäisellä rivillä on tulostus (0, 0).", lines[0].equals("(0, 0)"));
        assertTrue("Kun kutsuttiin satunnaiskavely(0, 0, 1), odotettiin että toisella rivillä ei ole tulostus (0, 0).", !lines[1].equals("(0, 0)"));
        assertTrue("Kun kutsuttiin satunnaiskavely(0, 0, 1), odotettiin että kolmas rivi on tyhjä.", lines[2].trim().equals(""));
        assertTrue("Kun kutsuttiin satunnaiskavely(0, 0, 1), odotettiin että neljännellä rivillä on tieto kuljetusta etäisyydestä (pitäisi olla 1.0).", lines[3].trim().contains("1.0"));

    }

}
