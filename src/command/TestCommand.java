package command;

public class TestCommand {
    public static void main(String[] args) {
        RequestClass requestClass = new RequestClass();

        ConcreteClassImplementOrder1 x = new ConcreteClassImplementOrder1(requestClass);
        ConcreteClassImplementOrder2 y = new ConcreteClassImplementOrder2(requestClass);

        Invoker invoker = new Invoker();
        invoker.takeOrder(x);
        invoker.takeOrder(y);

        invoker.placeOrders();
    }
}
