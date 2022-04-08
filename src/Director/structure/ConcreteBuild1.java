package Director.structure;

/**
 *
 * 建造者1
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class ConcreteBuild1 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件1");
    }

    @Override
    public void buildPartB() {
        product.add("部件2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
