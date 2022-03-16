package SimpleFctory.structure;

/**
 * @author liuhongji
 */
public class Main {

    public static void main(String[] args) {
        IProduct product = ProductFactory.createProduct("a");
        product.productAction();
    }
}
