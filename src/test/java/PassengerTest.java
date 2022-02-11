import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Joe Smith", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Joe Smith", passenger.getName());
    }

}
