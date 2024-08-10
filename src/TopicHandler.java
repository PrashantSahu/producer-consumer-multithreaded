public class TopicHandler {

    private Topic topic;

    public TopicHandler(Topic topic) {
        this.topic = topic;
    }

    void consumeToSubscriber() {
        Message message = topic.getMessages().get(topic.getMessages().size()-1);
        for(ISubscriber subscriber: topic.getSubscribers()) {
            new Thread(() -> subscriber.consume(message)).start();
           // subscriber.consume(message);
        }
    }
}
