package Memento.structure;

/**
 * 备份类
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/13
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
