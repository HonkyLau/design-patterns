package TemplateMethod.structure;

/**
 * 模版方法抽象类
 *
 * @author liuhongji
 */
public abstract class AbstClass {

    abstract void operation1();
    abstract void operation2();

    public void templateMethod(){
        operation1();
        operation2();
    }
}
