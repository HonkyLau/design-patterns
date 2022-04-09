package Observer.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类，维护订阅的观察者
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public abstract class Topic {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remote(Observer observer){
        observers.remove(observer);
    }

    public void call(){
        observers.stream().forEach(
                observer -> observer.update()
        );
    }


}
