package MethodFactory.structure;

/**
 * @author liuhongji
 */
public class ProductAFactory implements IFactory{

    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
