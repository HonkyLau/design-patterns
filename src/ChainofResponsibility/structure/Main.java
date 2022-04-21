package ChainofResponsibility.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/22
 */
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        //形成职责链
        handler1.setSuccessor(handler2);

        //传递请求
        handler1.handle(14);
    }
}
