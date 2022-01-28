package observer;

public class SecondObserver extends Observer {
    public SecondObserver(Subject subject) {
        this.subject = subject;
        this.subject.atach(this);
    }
    @Override
    public void update() {
        System.out.println("Second Observer: " + Integer.toOctalString(subject.getState(15)));
    }
}
