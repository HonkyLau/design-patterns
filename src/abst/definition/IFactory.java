package abst.definition;

/**
 * 抽象工厂
 *
 * @author liuhongji
 */
public interface IFactory {

    IProductA createProductA();

    IProductB createProductB();
}
