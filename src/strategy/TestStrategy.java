package strategy;

import observer.SecondObserver;

public class TestStrategy {
    public static void main(String[] args) {
        TypeOfStrategy typeOfStrategy = new TypeOfStrategy(new FirstStrategy());
        System.out.println(typeOfStrategy.executeStrategy(10,5));

        typeOfStrategy = new TypeOfStrategy(new SubstractStrategy());
        System.out.println(typeOfStrategy.executeStrategy(32,1));

        typeOfStrategy = new TypeOfStrategy(new MulStrategy());
        System.out.println(typeOfStrategy.executeStrategy(12, 12));
    }
}
