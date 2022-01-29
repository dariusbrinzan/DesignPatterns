package builder;

public class OrderBuilder {

    public Order prepareMeal() {
        Order order = new Order();
        order.addItem(new VeganBurgir());
        order.addItem(new Coke());
        return order;
    }

    public Order prepareMeal1() {
        Order order = new Order();
        order.addItem(new ChickenBurgir());
        order.addItem(new Pepsi());
        return order;
    }
}
