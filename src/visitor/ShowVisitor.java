package visitor;

public class ShowVisitor implements Visitor {
    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visited monitor");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Visited keyboard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visited mouse");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Visited computer");
    }

    @Override
    public void visit(GPU gpu) {
        System.out.println("Visited GPU RX6900xt");
    }
}
