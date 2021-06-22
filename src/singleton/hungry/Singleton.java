package singleton.hungry;

/**
 * @author liuhongji
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return SINGLETON;
    }
}
