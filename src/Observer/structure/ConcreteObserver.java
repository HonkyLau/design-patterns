package Observer.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class ConcreteObserver extends Observer {

    @Override
    void update() {
        System.out.println("收到通知，执行操作");
    }
}
