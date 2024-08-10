import java.util.HashMap;
import java.util.Map;

public class MyQueue {

    Map<String, TopicHandler> topicHandlerMap;
    Map<String, Topic> topicMap;

    public MyQueue() {
        topicHandlerMap = new HashMap<>();
        topicMap = new HashMap<>();
    }


    public Topic createTopic(String topicName) {

        Topic topic = new Topic(topicName);
        TopicHandler topicHandler = new TopicHandler(topic);
        topicHandlerMap.put(topicName, topicHandler);
        topicMap.put(topicName, topic);

        return topic;
    }

    void publishMessage(String topicName, Message message) {
        TopicHandler handler = topicHandlerMap.get(topicName);
        Topic topic = topicMap.get(topicName);
        topic.getMessages().add(message);
        handler.consumeToSubscriber();
    }
}
