package strategy.definition;

/**
 * 具体策略实现
 * @author liuhongji
 */
public class ConcreteStrategyB extends Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("execute stategy B");
    }
}
