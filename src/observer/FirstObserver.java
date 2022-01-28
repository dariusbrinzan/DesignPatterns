package observer;

public class FirstObserver extends Observer {
    public FirstObserver(Subject subject) {
        this.subject = subject;
        this.subject.atach(this);
    }

    @Override
    public void update() {
        System.out.println("FirstObserver: " + Integer.toBinaryString(subject.getState(15)));
    }
}
