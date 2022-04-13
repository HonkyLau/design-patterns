package Memento.structure;

/**
 *
 * 需要备份的类
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/13
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //备份
    public Memento createMemento(){
        return new Memento(this.state);
    }

    //恢复
    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

}
