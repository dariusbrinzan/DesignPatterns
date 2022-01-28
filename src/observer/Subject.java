package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public int getState(int i) {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void atach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }
}
