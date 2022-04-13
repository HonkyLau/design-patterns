package Memento.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/13
 */
public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("on");

        //备份
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        //状态被修改了
        originator.setState("off");

        //恢复保存的状态
        originator.setMemento(caretaker.getMemento());



    }
}
