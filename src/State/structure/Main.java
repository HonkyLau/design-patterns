package State.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/10
 */
public class Main {
    public static void main(String[] args) {
        //初始状态是A
        Context context = new Context(new ConcreteStateB());

        //将状态从A切换到B
        context.changeState();

    }
}
