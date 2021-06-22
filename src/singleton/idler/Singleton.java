package singleton.idler;

/**
 * @author liuhongji
 */
public class Singleton {

    private static Singleton singleton = null;
    private static final Object LOCK_OBJECT = new Object();

    private Singleton(){}

    public static Singleton getInstance() {

        if (singleton == null) {
            synchronized (LOCK_OBJECT) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
