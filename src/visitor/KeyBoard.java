package visitor;

public class KeyBoard implements ComputerInterface {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
