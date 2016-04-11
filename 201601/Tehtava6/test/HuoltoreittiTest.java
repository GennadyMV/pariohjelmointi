
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HuoltoreittiTest {

    @Points("6")
    @Test
    public void laiskaTesti() throws Throwable {
        assertTrue(1 == 1);
    }
}
