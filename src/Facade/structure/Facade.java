package Facade.structure;

/**
 * 外观类
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/3/31
 */
public class Facade {

    private SystemOne systemOne;
    private SystemTwo systemTwo;
    private SystemThree systemThree;

    public Facade() {
        systemOne = new SystemOne();
        systemTwo = new SystemTwo();
        systemThree = new SystemThree();
    }

    public void MethodA(){
        this.systemOne.methodOne();
        this.systemTwo.methodTwo();
    }

    public void MethodB(){
        this.systemTwo.methodTwo();
        this.systemThree.methodThree();
    }

}
