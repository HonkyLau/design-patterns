package ChainofResponsibility.structure;

/**
 *
 * 职责人的抽象类
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/22
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handle(int request);
}
