package Observer.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class ConcreteTopic extends Topic{

    //主题实现类的状态（引起通知的变量）
    private String topicState;

    public String getTopicState() {
        return topicState;
    }

    public void setTopicState(String topicState) {
        this.topicState = topicState;
    }

}
