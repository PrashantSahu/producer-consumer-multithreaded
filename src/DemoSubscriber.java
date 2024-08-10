public class DemoSubscriber implements ISubscriber{

    String id;

    DemoSubscriber(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void consume(Message message) {
        System.out.println("Subscriber "+ getId() +" consumed message "+message.getMessage());
    }
}
