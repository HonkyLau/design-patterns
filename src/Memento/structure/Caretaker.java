package Memento.structure;

/**
 * 管理者类，用来保存备份数据
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/13
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
