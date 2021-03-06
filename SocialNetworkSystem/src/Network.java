import java.util.HashSet;

/**
 * Created by nikol on 27.06.2016.
 */
public class Network {
    private HashSet<Person> persons;
    private KnowsResolver knowsResolver;
    private StarResolver starResolver;

    public Network() {
        persons = new HashSet<>();
        knowsResolver = new KnowsResolver();
        starResolver = new StarResolver();
    }

    public HashSet<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public KnowsResolver getKnowsResolver() {
        return knowsResolver;
    }
}
