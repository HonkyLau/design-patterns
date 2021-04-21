package strategy.definition;

/**
 * 客户端
 * @author liuhongji
 */
public class Main {

    public static void main(String[] args) {

        Context context = new Context(new ConcreteStrategyA());
        context.contextInteface();

        context.setStrategy(new ConcreteStrategyB());
        context.contextInteface();

        context.setStrategy(new ConcreteStrategyC());
        context.contextInteface();
    }




}
