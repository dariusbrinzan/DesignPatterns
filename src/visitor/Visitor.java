package visitor;

public interface Visitor {
    public void visit(Monitor monitor);
    public void visit(KeyBoard keyBoard);
    public void visit(Mouse mouse);
    public void visit(Computer computer);
    public void visit(GPU gpu);
}
