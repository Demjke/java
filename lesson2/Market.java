package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> actors = new ArrayList<Actor>();
    private List<Product> product = new ArrayList<Product>();
    private List<String> queue = new ArrayList<String>();

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
    }

    /************************************** */
    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        product
    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void update() {

        if (hasOrder()) {
            
Order order = takeOrder();

System.out.println("Заказ обработан: " + order.toString());
        } if {
          
System.out.println("Очередь заказов пуста.");
        }
    }

}
