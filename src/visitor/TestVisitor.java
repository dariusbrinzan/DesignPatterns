package visitor;

public class TestVisitor {
    public static void main(String[] args) {
        ComputerInterface computerInterface = new Computer();
        computerInterface.accept(new ShowVisitor());
    }
}
