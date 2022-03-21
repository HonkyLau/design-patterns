package Decorator.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/3/22
 */
public class ConcreteComponentB extends Decorator{

    @Override
    public void handle() {
        super.handle();
        System.out.println("ConcreteComponentB 的装饰行为");
    }
}
