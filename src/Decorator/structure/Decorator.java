package Decorator.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/3/22
 */
public abstract class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void handle() {
        if (null != component) {
            component.handle();
        }
    }
}
