package ChainofResponsibility.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/22
 */
public class ConcreteHandler1 extends Handler{
    @Override
    void handle(int request) {
        if(request>=0 && request <10){
            System.out.println("ConcreteHandler1 执行");
        }else{
            this.successor.handle(request);
        }
    }
}
