package factory.method.definition;

/**
 * @author liuhongji
 */
public class Main {

    public static void main(String[] args) {
        IFactory productFactory = new ProductFactory();
        IProduct product = productFactory.createProduct();
        product.productAction();
    }
}
