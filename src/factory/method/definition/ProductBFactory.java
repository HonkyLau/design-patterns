package factory.method.definition;

/**
 * @author liuhongji
 */
public class ProductBFactory implements IFactory{

    @Override
    public IProduct createProduct() {
        return new ConcreteProductB();
    }
}
