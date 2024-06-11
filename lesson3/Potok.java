package lesson3;

import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<Group> {
    private List<Group> group;
    private String name;

    public Potok(List<Group> group, String name) {
        this.group = group;
        this.name = name;
    }

    public List<Group> getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<Group> iterator() {
        return group.iterator();
    }
}