package Strategy.springsource;

import java.io.File;
import java.io.InputStream;
import java.net.URI;

/**
 * @author liuhongji
 * @version 1.0
 */
public class ClassPathResource implements Resource {
    @Override
    public boolean exists() {
        return false;
    }

    @Override
    public File getFile() {
        return null;
    }

    @Override
    public URI getURI() {
        return null;
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
