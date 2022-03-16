package Proxy.structure;

/**
 * 代理类实现和真实对象相同的接口
 *
 * @author liuhongji
 */
public class Proxy extends ISubject{

    private ISubject subject;

    @Override
    void request() {
        if(null == subject){
            subject = new Subject();
        }
        subject.request();
    }
}
