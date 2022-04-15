package Brideg.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @data 2022/4/15
 */
public class Main {
    public static void main(String[] args) {

        Implementor impl1 = new ConcreteImpl1();

        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(impl1);

        abstraction.operation();
    }
}
