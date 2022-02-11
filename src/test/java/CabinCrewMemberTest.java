import airlineEmployee.CabinCrewMember;
import airlineEmployee.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
    cabinCrewMember = new CabinCrewMember("Mable Able" , RankType.FLIGHTATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrewMember.getRankType());
    }
}
