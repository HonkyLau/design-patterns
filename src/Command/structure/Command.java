package Command.structure;

/**
 * 命令抽象类
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/21
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    abstract void execute();
}
