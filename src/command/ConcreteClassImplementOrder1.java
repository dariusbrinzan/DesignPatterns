package command;

public class ConcreteClassImplementOrder1 implements Order {
    private RequestClass abcOrder;

    public ConcreteClassImplementOrder1(RequestClass abcOrder) {
        this.abcOrder = abcOrder;
    }

    @Override
    public void execute() {
        abcOrder.buy();
    }
}
