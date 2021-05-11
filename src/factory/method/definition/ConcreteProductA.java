package factory.method.definition;

/**
 * 具体产品
 * @author liuhongji
 */
public class ConcreteProductA implements IProduct {
    @Override
    public void productAction() {
        System.out.println("product a");
    }
}
