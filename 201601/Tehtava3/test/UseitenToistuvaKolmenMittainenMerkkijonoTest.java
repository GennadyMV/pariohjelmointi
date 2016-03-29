
import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UseitenToistuvaKolmenMittainenMerkkijonoTest {

    @Rule
    public MockStdio io = new MockStdio();

    @Test
    @Points("3")
    public void heihei() {
        assertTrue("Kokeile ohjelmaasi syötteellä \"HEIHEI\".", Toistuvat.kolmenMittainenToisto("HEIHEI").equals("HEI"));
    }
    
    @Test
    @Points("3")
    public void lolheilol() {
        assertTrue("Kokeile ohjelmaasi syötteellä \"LOLHEILOL\".", Toistuvat.kolmenMittainenToisto("LOLHEILOL").equals("LOL"));
    }
    
    @Test
    @Points("3")
    public void workworkworkwor() {
        assertTrue("Kokeile ohjelmaasi syötteellä \"WORKWORKWORKWO\".", Toistuvat.kolmenMittainenToisto("WORKWORKWORKWO").equals("KWO"));
    }

}
