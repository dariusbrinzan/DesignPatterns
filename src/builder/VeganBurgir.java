package builder;

public class VeganBurgir extends Burger {

    @Override
    public String name() {
        return "Vegan burgir";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
