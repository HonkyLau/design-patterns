package Strategy.springsource;

/**
 * 资源访问策略接口
 *
 * @author liuhongji
 * @version 1.0
 */
public interface ResourceLoader {

    /**
     * 获取资源访问具体实现类
     * @param location
     * @return
     */
    Resource getResource(String location);
}
