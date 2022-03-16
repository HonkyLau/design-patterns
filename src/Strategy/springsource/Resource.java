package Strategy.springsource;

import java.io.File;
import java.net.URI;

/**
 * spring资源访问接口
 *
 * @author liuhongji
 * @version 1.0
 */
public interface Resource extends InputStreamSource{

    /**
     * 返回资源是否存在
     * @return
     */
    boolean exists();

    /**
     *
     * @return
     */
    default boolean isReadable() {
        return exists();
    }

    /**
     * 返回资源文件是否打开
     * @return
     */
    default boolean isOpen() {
        return false;
    }

    /**
     * 返回资源对应的 File 对象
     * @return
     */
    File getFile();

    /**
     * 返回资源对应的 URL 对象
     * @return
     */
    URI getURI();

}
