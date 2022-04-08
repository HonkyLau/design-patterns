package Director.structure;

/**
 *
 * 建造者2
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class ConcreteBuild2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件K");
    }

    @Override
    public void buildPartB() {
        product.add("部件V");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
