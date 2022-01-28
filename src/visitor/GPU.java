package visitor;

public class GPU implements ComputerInterface {
    @Override
    public void accept(Visitor visitorComputer) {
        visitorComputer.visit(this);
    }
}
