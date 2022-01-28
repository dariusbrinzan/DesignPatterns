package command;

public class ConcreteClassImplementOrder2 implements Order{
    private RequestClass abcSell;

    public ConcreteClassImplementOrder2(RequestClass abcSell) {
        this.abcSell = abcSell;
    }

    @Override
    public void execute() {
        abcSell.sell();
    }
}
