package Proxy.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @2022/3/15
 */
public class Subject extends ISubject {
    @Override
    void request() {
        System.out.println("send request");
    }
}
