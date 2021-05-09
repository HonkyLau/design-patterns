package factory.method.definition;

/**
 * @author liuhongji
 */
public class ProductFactory implements IFactory{

    @Override
    public IProduct createProduct() {
        return new ConcreteProduct();
    }
}
