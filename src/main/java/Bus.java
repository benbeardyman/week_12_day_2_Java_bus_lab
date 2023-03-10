import java.beans.PersistenceDelegate;
import java.util.ArrayList;

public class Bus {

    private String destination;
    public int capacity;
    private ArrayList<Person> passengers;

    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUpPassenger(BusStop busStop) {
        Person person = busStop.removePassenger();
        this.addPassenger(person);

    }
}
