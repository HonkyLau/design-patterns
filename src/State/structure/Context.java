package State.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/10
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void changeState(){
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
