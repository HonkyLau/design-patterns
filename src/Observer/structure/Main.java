package Observer.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class Main {
    public static void main(String[] args) {
        ConcreteTopic topic = new ConcreteTopic();
        topic.setTopicState("initialize");

        Observer observer = new ConcreteObserver();
        observer.setName("observer 1");

        //订阅了某主题
        topic.add(observer);

        //主题发生改变
        topic.setTopicState("prepare to notify others");

        //通知订阅者
        topic.call();

    }
}
