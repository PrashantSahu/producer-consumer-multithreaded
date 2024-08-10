import java.util.ArrayList;
import java.util.List;

public class Topic {

    private String topicName;
    private List<Message> messages;
    private List<ISubscriber> subscribers;


    public String getTopicName() {
        return topicName;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<ISubscriber> getSubscribers() {
        return subscribers;
    }



    Topic(String topicName) {

        this.topicName = topicName;
        messages = new ArrayList<>();
        subscribers = new ArrayList<>();

    }

    void addMessage(Message message) {
        messages.add(message);

    }

    void addSubscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }
}
