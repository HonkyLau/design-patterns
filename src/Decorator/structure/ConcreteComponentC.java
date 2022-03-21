package Decorator.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/3/22
 */
public class ConcreteComponentC extends Decorator{

    @Override
    public void handle() {
        super.handle();
        System.out.println("ConcreteComponentC 的装饰行为");
    }
}
