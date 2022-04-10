package State.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/10
 */
public class ConcreteStateB extends State{
    @Override
    void handle(Context context) {
        System.out.println("将状态从");
        context.setState(new ConcreteStateA());
    }
}
