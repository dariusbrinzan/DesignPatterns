package builder;

public class ChickenBurgir extends Burger {
    @Override
    public String name() {
        return "Chicken burgir";
    }

    @Override
    public float price() {
        return 32.0f;
    }
}
