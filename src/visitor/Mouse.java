package visitor;

public class Mouse implements ComputerInterface {
    @Override
    public void accept(Visitor visitorComputer) {
        visitorComputer.visit(this);
    }
}
