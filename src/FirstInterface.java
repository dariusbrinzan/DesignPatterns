public interface FirstInterface {
    default void doAction() {
        System.out.println("EZ");
    }

    void doJob();
}

interface SecondInterface {
    default void doAction() {
        System.out.println("EZX2");
    }

    void doStuff();
}

class Class implements FirstInterface, SecondInterface {
    @Override
    public void doAction() {
        System.out.println("Action by Class");
    }

    @Override
    public void doStuff() {
        System.out.println("Stuff");
    }

    @Override
    public void doJob() {
        System.out.println("Job");
    }
}
