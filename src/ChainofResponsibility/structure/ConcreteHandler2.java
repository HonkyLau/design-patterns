package ChainofResponsibility.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/22
 */
public class ConcreteHandler2 extends Handler{
    @Override
    void handle(int request) {
        if(request>=10 && request <20){
            System.out.println("ConcreteHandler2 执行");
        }else{
            this.successor.handle(request);
        }
    }
}
