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
        assertEquals("Mable Able", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrewMember.getRankType());
    }

    @Test
    public void canChangeName() {
        cabinCrewMember.setName("Mable Smith");
        assertEquals("Mable Smith", cabinCrewMember.getName());
    }

    @Test
    public void canChangeRank() {
        cabinCrewMember.setRankType(RankType.PURSER);
        assertEquals(RankType.PURSER, cabinCrewMember.getRankType());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("Sit back, relax and enjoy the flight", cabinCrewMember.relayMessage("Start of flight"));
        assertEquals("Please fasten seatbelts", cabinCrewMember.relayMessage("Turbulence"));
    }
}
