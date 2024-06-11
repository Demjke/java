package lesson3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");
        Group group3 = new Group("Group 3");

        Potok potok1 = new Potok(Arrays.asList(group3, group1, group2), "Potok-1");
        Potok potok2 = new Potok(Arrays.asList(group3), "Potok-2");
        Potok potok3 = new Potok(Arrays.asList(group1, group2), "Potok-3");

        List<Potok> potoki = Arrays.asList(potok1, potok2, potok3);

        Controller controller = new Controller();
        controller.sortPotoki(potoki);

        for (Potok potok : potoki) {
            int groupCount = potok.getGroup().size();
            System.out.println(potok.getName() + " is " + groupCount + "groups.");
        }
    }
}