package Command.structure;

/**
 * 具体命令
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/21
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.action1();
    }
}
