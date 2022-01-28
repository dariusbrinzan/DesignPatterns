public class Star {
    private int shiness;

    static void change (Star s, int newShine) {
        s = new Star();
        s.shiness = newShine;
    }

    public static void main(String[] args) {
        Star star = new Star();
        System.out.println("Old shiness:" + star.shiness + "|");
        change(star, 10);
        System.out.println("New shininess:" + star.shiness);
    }
}
