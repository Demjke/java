package lesson2;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
