import airlineEmployee.CabinCrewMember;
import airlineEmployee.Pilot;
import airlineEmployee.RankType;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.*;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Pilot firstOfficer;
    CabinCrewMember flightAttendant1;
    CabinCrewMember flightAttendant2;
    Plane plane;

    @Before
    public void before() {
        pilot = new Pilot("Buck Rodgers", RankType.CAPTAIN, "WE3456Y");
        flightAttendant1 = new CabinCrewMember("Pete Smith", RankType.FLIGHTATTENDANT);
        flightAttendant2 = new CabinCrewMember("Julie White", RankType.FLIGHTATTENDANT);
        plane = new Plane(PlaneType.AIRBUS340);
        flight = new Flight(plane,"FR756", "FUE", "EDI", "12:30");
        flight.addPilots(pilot);
//        flight.addCabinCrewMembers(firstOfficer);
//        flight.addCabinCrewMembers(flightAttendant1);
//        flight.addCabinCrewMembers(flightAttendant2);
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.AIRBUS340, flight.getPlane().getPlaneType());
    }

    @Test
    public void canChangePlane() {
        plane = new Plane(PlaneType.BOEING747);
        flight.setPlane(plane);
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canChangeFlightNumber() {
        flight.setFlightNumber("FR55");
        assertEquals("FR55", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("FUE", flight.getDestination());
    }

    @Test
    public void canChangeDestination() {
        flight.setDestination("EDI");
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canChangeDepartureAirport() {
        flight.setDepartureAirport("FUE");
        assertEquals("FUE", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("12:30", flight.getDepartureTime());
    }

    @Test
    public void canChangeDepartureTime() {
        flight.setDepartureTime("13:00");
        assertEquals("13:00", flight.getDepartureTime());
    }

    @Test
    public void hasPilots() {
        assertTrue(flight.getPilots().contains(pilot));
    }

    @Test
    public void canAddPilots() {
        firstOfficer = new Pilot("Skye Silimit", RankType.FIRSTOFFICER, "SD45567U");
        flight.addPilots(firstOfficer);
        assertTrue(flight.getPilots().contains(firstOfficer));
    }

    @Test 
    public void canRemovePilots() {
        flight.removePilots(pilot);
        assertFalse(flight.getPilots().contains(pilot));
    }
}
