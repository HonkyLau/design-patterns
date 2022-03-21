package Decorator.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/3/22
 */
public class ConcreteComponentA extends Decorator{

    @Override
    public void handle() {
        super.handle();
        System.out.println("ConcreteComponentA 的装饰行为");
    }
}
