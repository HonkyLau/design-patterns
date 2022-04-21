package Command.structure;

/**
 * 传递命令的中间人
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/21
 */
public class Invoker {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void notifyExecuteCommand(){
        command.execute();
    }
}
