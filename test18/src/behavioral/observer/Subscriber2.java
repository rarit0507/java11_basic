package behavioral.observer;

public class Subscriber2 implements Observer {

    Subject subject;
    private String content;

    public Subscriber2(Subject subject) {
        subject.add(this);
    }

    @Override
    public void update(String content) {
        this.content = content;
        display();
    }

    private void display() {
        System.out.println("subscriber 2");
        System.out.println("content : " + content);
        System.out.println("\n");
    }
}