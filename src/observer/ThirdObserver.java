package observer;

public class ThirdObserver extends Observer {

    public ThirdObserver(Subject subject) {
        this.subject = subject;
        this.subject.atach(this);
    }
    @Override
    public void update() {
        System.out.println("Third observer: " + Integer.toHexString(subject.getState(15)));
    }
}
