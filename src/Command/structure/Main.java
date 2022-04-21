package Command.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/21
 */
public class Main {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        //发起命令
        Command command = new ConcreteCommand(receiver);

        //中间人设置命令
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        //通知执行命令
        invoker.notifyExecuteCommand();



    }
}
