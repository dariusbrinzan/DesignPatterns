package visitor;

public class Computer implements ComputerInterface {
    ComputerInterface[] parts;

    public Computer() {
        parts = new ComputerInterface[] {new Mouse(), new Monitor(), new KeyBoard(), new GPU()};
    }

    @Override
    public void accept(Visitor visitorComputer) {
        for (ComputerInterface part : parts) {
            part.accept(visitorComputer);
        }
        visitorComputer.visit(this);
    }
}
