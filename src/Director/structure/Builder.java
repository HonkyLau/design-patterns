package Director.structure;

/**
 * 抽象建造类
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();

}
