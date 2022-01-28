package observer;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new FirstObserver(subject);
        new SecondObserver(subject);
        new ThirdObserver(subject);

        System.out.println("First change: 15");
        subject.setState(15);
        System.out.println("Second change: 10");
        subject.setState(10);
    }
}
