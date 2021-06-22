package abst.definition;

/**
 * @author liuhongji
 */
public class ConcreteFactory1 implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductB1();
    }
}
