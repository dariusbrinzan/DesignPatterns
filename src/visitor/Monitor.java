package visitor;

public class Monitor implements ComputerInterface {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
