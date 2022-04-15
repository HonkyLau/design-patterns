package Brideg.structure;

/**
 * 桥接模式的抽象部分
 *
 * @author liuhongji
 * @version 1.0
 * @data 2022/4/15
 */
public class Abstraction {

    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    protected void operation(){
        implementor.operation();
    }

}
