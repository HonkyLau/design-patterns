package Singleton.hungry;

/**
 * @author liuhongji
 */
public class SingletonHungry {

    private static final SingletonHungry SINGLETON_HUNGRY = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance(){
        return SINGLETON_HUNGRY;
    }
}
