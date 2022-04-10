package State.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/10
 */
public abstract class State {
    /**
     * 通过关联Context类切换状态，区别于策略模式的关键
     *
     * @param context
     */
    abstract void handle(Context context);
}
