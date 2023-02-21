import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Castle");
        person = new Person();

    }

    @Test
    public void canAddToQueue() {
        busStop.addPassenger(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemoveFromQueue() {
        busStop.addPassenger(person);
        busStop.removePassenger();
        assertEquals(0, busStop.queueCount());
    }
}
