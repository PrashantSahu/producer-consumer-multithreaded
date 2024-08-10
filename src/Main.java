public class Main {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        Topic topic1 = queue.createTopic("Topic 1");

        Topic topic2 = queue.createTopic("Topic 2");

        ISubscriber consumer1 = new DemoSubscriber("Consumer 1");
        ISubscriber consumer2 = new DemoSubscriber("Consumer 2");
        ISubscriber consumer3 = new DemoSubscriber("Consumer 3");
        ISubscriber consumer4 = new DemoSubscriber("Consumer 4");
        ISubscriber consumer5 = new DemoSubscriber("Consumer 5");

        topic1.addSubscriber(consumer1);
        topic1.addSubscriber(consumer2);
        topic1.addSubscriber(consumer3);
        topic1.addSubscriber(consumer4);
        topic1.addSubscriber(consumer5);

        topic2.addSubscriber(consumer1);
        topic2.addSubscriber(consumer2);
        topic2.addSubscriber(consumer3);

        queue.publishMessage("Topic 1", new Message("message1"));

        queue.publishMessage("Topic 2", new Message("message2"));

    }
}