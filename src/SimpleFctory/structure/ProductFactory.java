package SimpleFctory.structure;

/**
 * 核心部分，工厂类
 * @author liuhongji
 */
public class ProductFactory {

    public static IProduct createProduct(String type){
        IProduct product = null;

        switch (type){
            case "a":
                product =  new ConcreteProductA();
                break;
            case "b":
                product = new ConcreteProductB();
                break;
        }

        return product;
    }

}
