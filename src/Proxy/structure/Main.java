package Proxy.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @2022/3/15
 */
public class Main {

    public static void main(String[] args) {
        ISubject subject = new Proxy();
        subject.request();
    }
}
