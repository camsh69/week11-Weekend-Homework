import airlineEmployee.Pilot;
import airlineEmployee.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Skye Silimit", RankType.FIRSTOFFICER, "XY12345T");
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("XY12345T", pilot.getLicenceNumber());
    }

    @Test
    public void canChangeLicenceNumber() {
        pilot.setLicenceNumber("XY12345Q");
        assertEquals("XY12345Q", pilot.getLicenceNumber());
    }
}
