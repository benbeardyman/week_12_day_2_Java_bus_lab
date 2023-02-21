import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private Person person2;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Leith", 3);
        person = new Person();
        person2 = new Person();
        busStop = new BusStop("Mars");


    }
    
    @Test
    public void busHasDestination(){
        assertEquals("Leith", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){

        bus.addPassenger(person);
        bus.addPassenger(person2);
        bus.removePassenger(person2);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canPickUp(){
        busStop.addPassenger(person);
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.queueCount());
    }

}
