package MethodFactory.structure;

/**
 * 具体产品
 * @author liuhongji
 */
public class ConcreteProductB implements IProduct {
    @Override
    public void productAction() {
        System.out.println("product b");
    }
}
