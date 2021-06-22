package abst.definition;

/**
 * @author liuhongji
 */
public class ConcreteFactory2 implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductB2();
    }
}
