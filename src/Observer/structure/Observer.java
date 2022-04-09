package Observer.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public abstract class Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void update();

}
