package strategy.definition;

/**
 * 上下文类，维护一个abstract strategy引用
 * @author liuhongji
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInteface(){
        strategy.algorithmInterface();
    }

}
