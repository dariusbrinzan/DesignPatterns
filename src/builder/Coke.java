package builder;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public float price() {
        return 3f;
    }
}
