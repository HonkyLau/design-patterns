package Decorator.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/3/22
 */
public class Main {

    public static void main(String[] args) {

        ConcreteComponentA a = new ConcreteComponentA();
        ConcreteComponentB b = new ConcreteComponentB();
        ConcreteComponentC c = new ConcreteComponentC();
        a.setComponent(b);
        c.setComponent(a);

        c.handle();

    }
}
