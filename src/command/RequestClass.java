package command;

public class RequestClass {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println(name + " " + quantity + " " + "bought");
    }
    public void sell(){
        System.out.println(name + " " + quantity + " " + "sold");
    }
}
