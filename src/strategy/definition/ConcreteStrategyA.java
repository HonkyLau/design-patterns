package strategy.definition;

/**
 * 具体策略实现，如果有新的策略，新增一个类似该实现的接口
 * @author liuhongji
 */
public class ConcreteStrategyA extends Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("execute stategy A");
    }
}
