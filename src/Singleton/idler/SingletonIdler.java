package Singleton.idler;

/**
 * @author liuhongji
 */
public class SingletonIdler {

    private static SingletonIdler singletonIdler = null;
    private static final Object LOCK_OBJECT = new Object();

    private SingletonIdler(){}

    public static SingletonIdler getInstance() {

        if (singletonIdler == null) {
            synchronized (LOCK_OBJECT) {
                if (singletonIdler == null) {
                    singletonIdler = new SingletonIdler();
                }
            }
        }
        return singletonIdler;
    }
}
