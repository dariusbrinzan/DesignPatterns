package builder;

public class TestBuilder {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        Order veganOrder = orderBuilder.prepareMeal();
        System.out.println("Vegan");
        veganOrder.getCommand();
    }
}
